import axios from 'axios';

const api = axios.create({
  baseURL: process.env.REACT_APP_API_URL || 'http://localhost:59942/api'
});

export const getEmployees = () => api.get('/emps');
export const createEmployee = (emp) => api.post('/emps', emp);
export const updateEmployee = (id, emp) => api.put(`/emps/${id}`, emp);
export const deleteEmployee = (id) => api.delete(`/emps/${id}`);

export default api;
