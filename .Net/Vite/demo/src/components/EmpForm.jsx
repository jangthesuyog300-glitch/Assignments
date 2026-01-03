import { useState } from 'react';

export default function EmpForm({ initialData = {}, onSubmit, onCancel }) {
  // ✅ FIXED: Initialize state directly from props (no useEffect needed)
  const [formData, setFormData] = useState({
    name: initialData.name || '',
    address: initialData.address || ''
  });
  const [errors, setErrors] = useState({});

  // ✅ REMOVED: Problematic useEffect that caused cascading renders

  const validate = () => {
    const newErrors = {};
    if (!formData.name.trim()) newErrors.name = 'Name is required';
    if (!formData.address.trim()) newErrors.address = 'Address is required';
    if (formData.name.trim().length > 50) newErrors.name = 'Name must be 50 chars or less';
    if (formData.address.trim().length > 50) newErrors.address = 'Address must be 50 chars or less';
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) {
      onSubmit({ ...formData, id: initialData.id });
    }
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
    if (errors[name]) {
      setErrors(prev => ({ ...prev, [name]: '' }));
    }
  };

  return (
    <div className="card">
      <h2>{initialData.id ? 'Edit Employee' : 'Add New Employee'}</h2>
      <form onSubmit={handleSubmit}>
        <div className="input-group">
          <input
            type="text"
            name="name"
            placeholder="Employee Name"
            value={formData.name}
            onChange={handleChange}
            maxLength={50}
          />
          {errors.name && <span style={{color: '#ef4444', fontSize: '14px'}}>{errors.name}</span>}
        </div>
        
        <div className="input-group">
          <input
            type="text"
            name="address"
            placeholder="Employee Address"
            value={formData.address}
            onChange={handleChange}
            maxLength={50}
          />
          {errors.address && <span style={{color: '#ef4444', fontSize: '14px'}}>{errors.address}</span>}
        </div>

        <div className="flex">
          <button type="submit" className="btn btn-primary" style={{flex: 1}}>
            {initialData.id ? 'Update Employee' : 'Create Employee'}
          </button>
          {onCancel && (
            <button type="button" className="btn btn-danger" onClick={onCancel} style={{flex: 1}}>
              Cancel
            </button>
          )}
        </div>
      </form>
    </div>
  );
}
