function erect_pyramid(N) {
    for (let i = 0; i < N; i++) {
        let row = "";
        for (let j = 0; j < N - i - 1; j++) {
            row += " ";
        }
        for (let j = 0; j < 2 * i + 1; j++) {
            row += "*";
        }
        for (let j = 0; j < N - i - 1; j++) {
            row += " ";
        }
        console.log(row);
    }
}

function inverted_pyramid(N) {
    for (let i = 0; i < N; i++) {
        let row = "";
        for (let j = 0; j < i; j++) {
            row += " ";
        }
        for (let j = 0; j < 2 * N - (2 * i + 1); j++) {
            row += "*";
        }
        for (let j = 0; j < i; j++) {
            row += " ";
        }
        console.log(row);
    }
}

function main() {
    const N = 5;
    erect_pyramid(N);
    inverted_pyramid(N);
}

main();
