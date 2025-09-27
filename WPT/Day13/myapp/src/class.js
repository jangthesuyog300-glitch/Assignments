import React, { Component } from 'react';

class TextCaseComponent extends Component {
    constructor(props) {
        super(props);
        this.state = { text: '' };
    }

    handleChange = (e) => {
        this.setState({ text: e.target.value });
    };

    handleUpperCase = () => {
        console.log(this.state.text.toUpperCase());
    };

    handleLowerCase = () => {
        console.log(this.state.text.toLowerCase());
    };

    render() {
        return (
            <div>
                <input
                    type="text"
                    value={this.state.text}
                    onChange={this.handleChange}
                    placeholder="Enter text"
                />
                <button onClick={this.handleUpperCase}>UPPER CASE</button>
                <button onClick={this.handleLowerCase}>lower case</button>
            </div>
        );
    }
}

export default TextCaseComponent;