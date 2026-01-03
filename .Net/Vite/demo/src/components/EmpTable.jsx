

export default function EmpTable({ employees, onEdit, onDelete, loading }) {
  if (loading) {
    return (
      <div className="card">
        <div style={{textAlign: 'center', padding: '40px'}}>
          <div style={{fontSize: '24px', color: '#6b7280'}}>Loading...</div>
        </div>
      </div>
    );
  }

  return (
    <div className="card">
      <div style={{display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '20px'}}>
        <h2>Employees ({employees.length})</h2>
      </div>
      
      {employees.length === 0 ? (
        <div style={{textAlign: 'center', padding: '40px', color: '#6b7280'}}>
          No employees found. Create one to get started!
        </div>
      ) : (
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Address</th>
              <th style={{width: '200px'}}>Actions</th>
            </tr>
          </thead>
          <tbody>
            {employees.map(emp => (
              <tr key={emp.id}>
                <td><strong>{emp.id}</strong></td>
                <td>{emp.name}</td>
                <td>{emp.address}</td>
                <td>
                  <div className="flex">
                    <button 
                      className="btn btn-warning" 
                      style={{padding: '8px 16px', fontSize: '12px'}}
                      onClick={() => onEdit(emp)}
                    >
                      Edit
                    </button>
                    <button 
                      className="btn btn-danger" 
                      style={{padding: '8px 16px', fontSize: '12px'}}
                      onClick={() => onDelete(emp.id)}
                    >
                      Delete
                    </button>
                  </div>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}
