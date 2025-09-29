import { useEffect, useState } from "react";

export default function Counter() {
    let [count, setCount] = useState(0);

    useEffect(() => {
        const interval = setInterval(() => {
            setCount(prevCount => prevCount + 1);
        }, 1000);

        // Cleanup interval on unmount
        return () => clearInterval(interval);
    }, []);

    function handler() {
        setCount(count + 1);
        console.log("Count " + count);
    }

    return (
        <>
            Counter =   {count}
            <br />
            <button onClick={handler}> Click Me </button>
        </>
    );
}