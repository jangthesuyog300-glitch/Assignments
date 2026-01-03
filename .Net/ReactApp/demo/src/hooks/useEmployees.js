import { useState, useEffect, useCallback } from 'react';
import * as employeeService from '../services/employeeService';

export default function useEmployees() {
  const [employees, setEmployees] = useState([]);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const fetchEmployees = useCallback(async () => {
    setLoading(true);
    setError(null);
    try {
      const { data } = await employeeService.getEmployees();
      setEmployees(data);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  }, []);

  const createEmployee = useCallback(async (employeeData) => {
    try {
      const { data } = await employeeService.createEmployee(employeeData);
      setEmployees(prev => [data, ...prev]);
      return data;
    } catch (err) {
      throw new Error(err.response?.data?.message || err.message);
    }
  }, []);

  const updateEmployee = useCallback(async (id, employeeData) => {
    try {
      const { data } = await employeeService.updateEmployee(id, employeeData);
      setEmployees(prev => prev.map(emp => 
        emp.id === id ? data : emp
      ));
      return data;
    } catch (err) {
      throw new Error(err.response?.data?.message || err.message);
    }
  }, []);

  const deleteEmployee = useCallback(async (id) => {
    try {
      await employeeService.deleteEmployee(id);
      setEmployees(prev => prev.filter(emp => emp.id !== id));
    } catch (err) {
      throw new Error(err.response?.data?.message || err.message);
    }
  }, []);

  useEffect(() => {
    fetchEmployees();
  }, [fetchEmployees]);

  return {
    employees,
    loading,
    error,
    refetch: fetchEmployees,
    createEmployee,
    updateEmployee,
    deleteEmployee
  };
}
