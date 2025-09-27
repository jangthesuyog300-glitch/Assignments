import React, { useState } from "react";

export default function StSub() {
    const [selected, setSelected] = useState("G");

    function G() {
        return (
            <>
                year: <input type="number" /><br />
                degree: <input type="text" /><br />
                final year score: <input type="number" /><br />
                univ: <input type="text" /><br />
            </>
        );
    }

    function PG() {
        return (
            <>
                year: <input type="number" /><br />
                Thesis subject: <input type="text" /><br />
            </>
        );
    }

    function UG() {
        return (
            <>
                year: <input type="number" /><br />
                SSC: <input type="text" /><br />
                HSC: <input type="text" /><br />
            </>
        );
    }

    function renderForm() {
        switch (selected) {
            case "G":
                return G();
            case "PG":
                return PG();
            case "UG":
                return UG();
            default:
                return null;
        }
    }

    return (
        <div className="outline">
            <h5>Child Component</h5>
            <select onChange={e => setSelected(e.target.value)} value={selected}>
                <option value="G">Graduate</option>
                <option value="PG">PG</option>
                <option value="UG">UG</option>
            </select>
            <div style={{ marginTop: "10px" }}>
                {renderForm()}
            </div>
        </div>
    );
}