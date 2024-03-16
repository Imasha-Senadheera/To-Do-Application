// Function to handle adding a new task
function addTask() {
    // Get form data
    var title = document.getElementById('title').value;
    var description = document.getElementById('description').value;
    var expectedDate = document.getElementById('expectedDate').value;

    // Create a task object
    var task = {
        title: title,
        description: description,
        expectedDate: expectedDate
    };

    // Send POST request to backend to add the task
    fetch('/add_task.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(task)
    })
        .then(response => response.json())
        .then(data => {
            // Handle response from backend
            if (data.success) {
                // Task added successfully
                alert('Task added successfully!');
                // Redirect to task list page or perform other actions as needed
                window.location.href = 'task_list.html';
            } else {
                // Error adding task
                alert('Error adding task. Please try again.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('An error occurred. Please try again later.');
        });
}

// Event listener for form submission
document.getElementById('taskForm').addEventListener('submit', function(event) {
    // Prevent default form submission
    event.preventDefault();
    // Call addTask function to handle task addition
    addTask();
});
