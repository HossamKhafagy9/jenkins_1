# jenkins_3
what is the benefit of using master-slave architecture rather than building on master only ?

1-Scalability: By utilizing slave nodes, you can distribute the build workload across multiple machines, allowing you to handle larger workloads and reduce build times. This helps in scaling your Jenkins infrastructure as your project or organization grows.

2-Parallel Execution: With a master-slave architecture, you can execute builds and tests concurrently on multiple slave nodes, enabling parallelization and faster feedback on the status of different stages of your pipeline.

3-Resource Isolation: Slave nodes provide resource isolation, allowing you to allocate specific machines or environments for particular types of builds or tests. This helps in managing dependencies, ensuring consistent build environments, and avoiding conflicts between different jobs running on the same master node.

4-High Availability: If the master node goes down, the slave nodes can continue to operate and perform builds, ensuring the availability and resilience of your CI/CD system.



what is different between authorization and authentication ? 

Authentication refers to the process of verifying the identity of a user or system. It involves validating the credentials provided, such as username and password, to determine if the user or system is who they claim to be. Authentication ensures that only authorized individuals or systems can access the resources or perform certain actions.

Authorization, on the other hand, is the process of granting or denying access rights and permissions to authenticated users or systems. Once a user or system is authenticated, authorization determines what actions or resources they are allowed to access based on their assigned roles, permissions, or privileges. It controls the level of access and sets boundaries to protect sensitive data and resources.

make jenkins-shared-library and make your jenkinsfile which you used in lab2 to point to this library 

![Screenshot from 2023-07-06 23-18-33](https://github.com/HossamKhafagy9/jenkins_3/assets/68228871/2799ab0f-4c9f-4f02-813d-640dfcb383fe)

![Screenshot from 2023-07-06 22-22-14](https://github.com/HossamKhafagy9/jenkins_3/assets/68228871/7709547d-8424-466a-ace5-cba01df84575)

![Screenshot from 2023-07-06 23-15-39](https://github.com/HossamKhafagy9/jenkins_3/assets/68228871/3cf4d41c-7851-457f-93fa-2111560b85f7)

try to make new slave as container or ec2 server and configure master to use it 

