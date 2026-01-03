import React from 'react';

const EmployeeList = ({ employees, loading, onEdit, onDelete }) => {
  if (loading) {
    return React.createElement('div', { className: 'alert alert-info' }, 'Loading employees...');
  }

  return React.createElement('div', { className: 'card' }, [
    React.createElement('div', { key: 'header', className: 'card-header' }, 
      React.createElement('h5', null, `Employees (${employees.length})`)
    ),
    React.createElement('div', { key: 'body', className: 'card-body p-0' },
      React.createElement('table', { className: 'table table-hover mb-0' }, [
        React.createElement('thead', { key: 'thead', className: 'table-light' },
          React.createElement('tr', null, [
            React.createElement('th', { key: 'id' }, 'ID'),
            React.createElement('th', { key: 'name' }, 'Name'),
            React.createElement('th', { key: 'address' }, 'Address'),
            React.createElement('th', { key: 'actions' }, 'Actions')
          ])
        ),
        React.createElement('tbody', { key: 'tbody' },
          employees.map(emp => 
            React.createElement('tr', { key: emp.id }, [
              React.createElement('td', { key: 'id' }, React.createElement('strong', null, emp.id)),
              React.createElement('td', { key: 'name' }, emp.name),
              React.createElement('td', { key: 'address' }, emp.address),
              React.createElement('td', { key: 'actions' }, [
                React.createElement('button', {
                  key: 'edit',
                  className: 'btn btn-sm btn-outline-primary me-1',
                  onClick: () => onEdit(emp)
                }, 'Edit'),
                React.createElement('button', {
                  key: 'delete',
                  className: 'btn btn-sm btn-outline-danger',
                  onClick: () => onDelete(emp.id)
                }, 'Delete')
              ])
            ])
          )
        )
      ])
    )
  ]);
};

export default EmployeeList;
