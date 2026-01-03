import React, { useState, useEffect } from 'react';

const EmployeeForm = ({ 
  initialValues, 
  onSubmit, 
  onCancel,
  loading 
}) => {
  const [formData, setFormData] = useState({
    name: '',
    address: ''
  });

  useEffect(() => {
    if (initialValues) {
      setFormData({
        name: initialValues.name || '',
        address: initialValues.address || ''
      });
    } else {
      setFormData({ name: '', address: '' });
    }
  }, [initialValues]);

  const handleSubmit = (e) => {
    e.preventDefault();
    const submitData = {
      name: formData.name,
      address: formData.address
    };
    onSubmit(submitData);
  };

  const handleCancel = () => {
    setFormData({ name: '', address: '' });
    onCancel();
  };

  const formTitle = initialValues ? 'Edit Employee' : 'Add New Employee';

  return React.createElement('form', { 
    onSubmit: handleSubmit, 
    className: 'card p-4' 
  }, [
    React.createElement('h5', { key: 'title', className: 'card-title mb-4' }, formTitle),
    
    React.createElement('div', { key: 'name-field', className: 'mb-3' }, [
      React.createElement('label', { 
        key: 'name-label', 
        className: 'form-label' 
      }, 'Name *'),
      React.createElement('input', {
        key: 'name-input',
        type: 'text',
        className: 'form-control',
        value: formData.name,
        onChange: (e) => setFormData({...formData, name: e.target.value}),
        required: true,
        placeholder: 'Enter employee name',
        maxLength: 50
      })
    ]),

    React.createElement('div', { key: 'address-field', className: 'mb-4' }, [
      React.createElement('label', { 
        key: 'address-label', 
        className: 'form-label' 
      }, 'Address'),
      React.createElement('input', {
        key: 'address-input',
        type: 'text',
        className: 'form-control',
        value: formData.address,
        onChange: (e) => setFormData({...formData, address: e.target.value}),
        placeholder: 'Enter address',
        maxLength: 50
      })
    ]),

    React.createElement('div', { key: 'buttons', className: 'd-flex gap-2' }, [
      React.createElement('button', {
        key: 'submit',
        type: 'submit',
        className: 'btn btn-primary',
        disabled: loading
      }, loading ? 'Saving...' : (initialValues ? 'Update' : 'Create')),
      React.createElement('button', {
        key: 'cancel',
        type: 'button',
        className: 'btn btn-outline-secondary',
        onClick: handleCancel,
        disabled: loading
      }, 'Cancel')
    ])
  ]);
};

export default EmployeeForm;
