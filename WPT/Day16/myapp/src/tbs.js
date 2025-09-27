import { useState } from "react";
import Cha from "./redio";

export default function Button1() {
    const [n1, setN1] = useState('');

    function handleCaseChange(newText) {
        setN1(newText);
    }

    return (
        <>
            <input
                type="text"
                value={n1}
                onChange={(e) => setN1(e.target.value)}
            />
            <Cha text={n1} f1={handleCaseChange} />
        </>
    );
}