import { useState } from "react";

export default function Counter() {
    const [count, setCount] = useState(0);

    function handler() {
        setCount(count + 1);
    }

    return (
        <>
            Counter = {count}
            <br />
            <button onClick={handler}>Click Me</button>
        </>
    );
}