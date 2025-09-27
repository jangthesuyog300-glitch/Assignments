const fs = require('fs');

fs.access('sample.txt', fs.constants.F_OK, (err) => {
    if (err) {
        console.error('File does not exist.');
        return;
    }

    fs.readFile('sample.txt', 'utf8', (err, data) => {
        if (err) {
            console.error('Error reading file: ', err);
            return;
        }

        for (let a = 1; a <= 10; a++) {
            console.log(a);
        }

        console.log('File content: ', data);
    });
});
