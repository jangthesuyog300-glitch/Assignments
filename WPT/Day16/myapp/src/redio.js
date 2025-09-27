import React from "react";

// Dummy implementations; replace with your actual functions
function UpperCase(str) {
    return str.toUpperCase();
}
function LowerCase(str) {
    return str.toLowerCase();
}
function TitelCase(str) {
    return str
        .toLowerCase()
        .split(' ')
        .map(word => word.charAt(0).toUpperCase() + word.slice(1))
        .join(' ');
}
export default function Cha({ text, f1 }) {
    function compute(e) {
        switch (e.target.value) {
            case "uc":
                f1(UpperCase(text));
                break;
            case "lc":
                f1(LowerCase(text));
                break;
                case "tc":
                f1(TitelCase(text));
                break;
            default:
                break;
        }
    }

    return (
        <>
            <section onChange={compute}>
                <label>
                    <input type="radio" name="case" value="uc" /> UpperCase
                </label>
                <label>
                    <input type="radio" name="case" value="lc" /> LowerCase
                </label>
                 <label>
                    <input type="radio" name="case" value="tc" /> TitelCase
                </label>
            </section>
        </>
    );
}