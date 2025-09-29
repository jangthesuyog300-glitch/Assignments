import React from "react";
import StSub from "./stsub";

export default function St() {
    return (
        <div className="outline">
            Name: <input type="text" /><br />
            Email: <input type="text" /><br />
            <StSub />
        </div>
    );
}