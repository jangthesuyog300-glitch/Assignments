import { useState } from "react";

export default function ListInput() {
    const [input, setInput] = useState("");
    const [items, setItems] = useState([]);

    function handleBlur() {
        if (input.trim() !== "") {
            setItems([...items, input]);
            setInput("");
        }
    }

    function handleChange(e) {
        setInput(e.target.value);
    }

    return (
        <>
            <input
                type="text"
                value={input}
                onChange={handleChange}
                onBlur={handleBlur}
                placeholder="Enter item and leave field"
            />
            <button onClick={handleBlur}>Click</button> 
            <br /><br />
            {items.length > 0 && (
                <ol>
                    {items.map((item, idx) => (
                        <li key={idx}>{item}</li>
                    ))}
                </ol>
            )}
        </>
    );
}