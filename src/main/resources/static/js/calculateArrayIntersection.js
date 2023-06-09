$(document).ready(function () {
    function validateNumber() {
        let arrayOneSize = document.getElementById("arrayOneSize");
        let arrayTwoSize = document.getElementById("arrayTwoSize");
        if (arrayOneSize.value > 50000 || arrayOneSize.value < 0 || arrayTwoSize.value > 50000 || arrayTwoSize.value < 0)
            return false
        return true;
    }

    $('#submitButton').click(function () {
        $('#myForm').submit();
    });

    // Handle form submission
    $('#myForm').submit(function (event) {
        event.preventDefault();
        let progressBar = document.getElementById("progressBar");
        progressBar.style.display = "block";
        if (validateNumber()) {
            $.ajax({
                url: "/intersection/calculate",
                type: 'POST',
                dataType: 'json',
                data: $('#myForm').serialize(),
                success: function (response) {
                    $('#errorMsg').text("");
                    $('#intersectionCount').text("Number of intersection: " + response.intersectionCount);
                    $('#timeTaken').text("Time taken: " + response.timeTaken + " seconds");
                    $("#myModal").modal("show");
                    progressBar.style.display = "none";
                },
                error: function (xhr, status, error) {
                    // Handle the error here
                    console.log('AJAX request error:', error);
                    progressBar.style.display = "none";
                }
            });
        } else {
            progressBar.style.display = "none";
            $('#intersectionCount').text("");
            $('#timeTaken').text("");
            $('#errorMsg').text("Numbers must be greater than 0 and less than 50000");
            $("#myModal").modal("show");
        }
    });
});