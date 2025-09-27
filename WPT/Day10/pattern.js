function pattern() {
    console.log('All arguments:', process.argv);

    let a = Number(process.argv[2]); // take the first user argument

    if (!isNaN(a) && a >= 1 && a <= 5) {
        for (let i = 0; i < 5; i++) {
            console.log(a);
        }
    } else {
        console.error(" Number should be between 1 and 5");
    }
}

// Call the function
pattern();
