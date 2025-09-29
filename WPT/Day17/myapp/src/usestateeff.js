import { useState, useEffect } from "react";

export default function Counter() {
    const [count, setCount] = useState(0);
    const [table, setTable] = useState([]);

    function handler() {
        setCount(count + 1);
    }

    useEffect(() => {
        // Generate table for current counter value
        if (count > 0) {
            const newTable = [];
            for (let i = 1; i <= 10; i++) {
                newTable.push(`${count} x ${i} = ${count * i}`);
            }
            setTable(newTable);
        } else {
            setTable([]);
        }
    }, [count]);

    return (
        <>
            Counter = {count}
            <br />
            <button onClick={handler}>Click Me</button>
            <br /><br />
            {table.length > 0 && (
                <table border="1" cellPadding="5">
                    <thead>
                        <tr>
                            <th colSpan="2">Table of {count}</th>
                        </tr>
                    </thead>
                    <tbody>
                        {table.map((row, idx) => (
                            <tr key={idx}>
                                <td>{row}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            )}
        </>
    );
}