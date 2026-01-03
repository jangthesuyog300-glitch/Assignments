import React, { useState } from 'react';
import useEmployees from './hooks/useEmployees';
import EmployeeList from './components/EmployeeList';
import EmployeeForm from './components/EmployeeForm';

function App() {
  const {
    employees,
    loading,
    createEmployee,
    updateEmployee,
    deleteEmployee
  } = useEmployees();

  const [editingEmployee, setEditingEmployee] = useState(null);

  const handleEdit = (emp) => setEditingEmployee(emp);
  const handleCancel = () => setEditingEmployee(null);
  
  const handleSubmit = editingEmployee 
    ? (data) => updateEmployee(editingEmployee.id, data).then(handleCancel)
    : createEmployee;

  const handleDelete = (id) => {
    if (window.confirm('Are you sure you want to delete this employee?')) {
      deleteEmployee(id);
    }
  };

  return React.createElement('div', { className: 'container-fluid py-4' },
    React.createElement('div', { className: 'row' },
      React.createElement('div', { className: 'col-12' }, [
        React.createElement('h1', { key: 'title', className: 'mb-4' }, 'Employee Management'),
        
        React.createElement(EmployeeForm, {
          key: 'form',
          initialValues: editingEmployee,
          onSubmit: handleSubmit,
          onCancel: handleCancel,
          loading: loading
        }),
        
        React.createElement('div', { key: 'list', className: 'mt-4' },
          React.createElement(EmployeeList, {
            employees: employees,
            loading: loading,
            onEdit: handleEdit,
            onDelete: handleDelete
          })
        )
      ])
    )
  );
}

export default App;
