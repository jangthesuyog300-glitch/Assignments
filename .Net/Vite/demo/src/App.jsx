import { useState, useEffect } from 'react';

import EmpForm from './components/EmpForm';
import EmpTable from './components/EmpTable';
import { empService } from './api/empService';

export default function App() {
  const [employees, setEmployees] = useState([]);
  const [loading, setLoading] = useState(true);
  const [editingEmp, setEditingEmp] = useState(null);
  const [showForm, setShowForm] = useState(false);

  const fetchEmployees = async () => {
    try {
      setLoading(true);
      const data = await empService.getAll();
      setEmployees(Array.isArray(data) ? data : []);
    } catch (error) {
      console.error('Failed to fetch employees:', error);
      setEmployees([]);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    fetchEmployees();
  }, []);

  const handleCreate = async (emp) => {
    try {
      await empService.create(emp);
      setShowForm(false);
      fetchEmployees();
    } catch (error) {
      alert('Failed to create employee: ' + error.message);
    }
  };

  const handleUpdate = async (emp) => {
    try {
      await empService.update(emp.id, emp);
      setEditingEmp(null);
      setShowForm(false);
      fetchEmployees();
    } catch (error) {
      alert('Failed to update employee: ' + error.message);
    }
  };

  const handleDelete = async (id) => {
    if (!window.confirm('Are you sure you want to delete this employee?')) return;
    try {
      await empService.delete(id);
      fetchEmployees();
    } catch (error) {
      alert('Failed to delete employee: ' + error.message);
    }
  };

  const handleEdit = (emp) => {
    setEditingEmp(emp);
    setShowForm(true);
  };

  const handleCancel = () => {
    setEditingEmp(null);
    setShowForm(false);
  };

  return (
    <div className="container">
      <div className="card" style={{marginBottom: '32px'}}>
        <h1 style={{color: '#1f2937', marginBottom: '8px'}}>Employee Management</h1>
        <p style={{color: '#6b7280'}}>CRUD operations for Employee records</p>
      </div>

      <div className="grid">
        {(showForm || editingEmp) && (
          <EmpForm
            initialData={editingEmp}
            onSubmit={editingEmp ? handleUpdate : handleCreate}
            onCancel={handleCancel}
          />
        )}
        
        <div>
          <button 
            className="btn btn-success" 
            style={{width: '100%', marginBottom: '20px'}}
            onClick={() => setShowForm(true)}
          >
            + Add New Employee
          </button>
          
          <EmpTable
            employees={employees}
            onEdit={handleEdit}
            onDelete={handleDelete}
            loading={loading}
          />
        </div>
      </div>
    </div>
  );
}
