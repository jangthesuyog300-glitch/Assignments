const API_BASE = import.meta.env.VITE_API_URL || 'http://localhost:59942/api';

export const empService = {
  async getAll() {
    const response = await fetch(`${API_BASE}/Emp`);
    if (!response.ok) throw new Error('Failed to fetch employees');
    return response.json();
  },

  async getById(id) {
    const response = await fetch(`${API_BASE}/Emp/${id}`);
    if (!response.ok) throw new Error('Employee not found');
    return response.json();
  },

  async create(emp) {
    const response = await fetch(`${API_BASE}/Emp`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(emp)
    });
    if (!response.ok) throw new Error('Failed to create employee');
    return response.json();
  },

  async update(id, emp) {
    const response = await fetch(`${API_BASE}/Emp/${id}`, {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(emp)
    });
    if (!response.ok) throw new Error('Failed to update employee');
    return response.json();
  },

  async delete(id) {
    const response = await fetch(`${API_BASE}/Emp/${id}`, {
      method: 'DELETE'
    });
    if (!response.ok) throw new Error('Failed to delete employee');
  }
};
