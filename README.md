# hft-24-winter

## Initial Brainstorming session

### Evolution of the lecture over the years

![Evolution](/images/2024_11_10_lecture_evolution.png)

### Basic distributed system - Communication & State

![Basics](/images/2024_11_10_basic_distributed_system.png)

### Modern distributed system 

![Advanced](/images/2024_11_10_modern_distributed_environment.png)

### Why distributed systems

![Why](/images/2024_11_10_brainstorm_why_distribution.png)

### Outlook on container technology

![Container Technology](/images/2024_11_10_container_technology.png)


## **2024 / 10 / 11 - Introduction to distributed systems - Overview Cloud Computing**  

### **Content Overview**
1. **The NIST Cloud Definition (2011)**
   - Breakdown of the NIST’s five essential cloud characteristics, deployment models, and service models.
  
2. **Overview of Major Cloud Providers**
   - Key players in the cloud space (AWS, Azure, Google Cloud, etc.).
   - Comparing evolution.

3. **Cloud Service/Abstraction Models**
   - IaaS, PaaS, SaaS revisited, with modern examples.
   - The evolution of abstraction models, including FaaS and Containers-as-a-Service (CaaS).

4. **Introduction to CNCF**
   - Role of the Cloud Native Computing Foundation (CNCF) in the cloud ecosystem.
   - CNCF Landscape: technologies, tools, and projects.

5. **Popular Technologies**
   - **Kubernetes**: Container orchestration in cloud-native environments.
   - **eBPF**: Extending kernel capabilities for monitoring and security.
   - **OpenTelemetry**: Observability standards and practices in modern cloud systems.

---

### **Learning Objectives**
By the end of this lecture, students will be able to:
- Describe the NIST cloud definition and its significance in the modern cloud landscape.
- Identify the major cloud providers and tell about their evolution.
- Differentiate between cloud service models and discuss their evolution, including modern abstraction models like CaaS.
- Explain the role of CNCF and analyze the CNCF landscape to identify key technologies and trends.
- Provide an overview of Kubernetes, eBPF, and OpenTelemetry, explaining their impact on cloud-native development.

---

### **Student/Review Questions**
#### For now:
1. What are the five essential characteristics of cloud computing according to NIST, and how do they apply to modern cloud services?
2. Identify 3 main cloud providers.
3. What are the differences between IaaS, PaaS, and SaaS? Give examples of each in today's cloud ecosystem.
4. What is the CNCF, and why is it important in the context of cloud-native technologies?
#### For later:
5. How does Kubernetes help in managing containerized applications in cloud-native environments?
6. What is eBPF, and what advantages does it provide in terms of system monitoring and security?
7. Explain the role of OpenTelemetry in modern cloud systems. How does it contribute to observability?

---

### **Suggested Reading & Resources**
- [NIST 2011 Cloud Computing Definition](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-145.pdf)
- CNCF [Cloud Native Landscape](https://landscape.cncf.io/)
- [Introduction to Kubernetes](https://kubernetes.io/docs/tutorials/)
- [Understanding eBPF](https://ebpf.io/)
- [OpenTelemetry Documentation](https://opentelemetry.io/docs/)

---

### Homework

- Get a GitHub or GitLab or Bitbucket account
- Play with Codespaces, Gitpod or IDX

Here’s the documentation for the new lecture:

---

## **2024 / 10 / 18 - Introduction to Spring Boot - Overview Cloud IDEs**  

### **Content Overview**

1. **Introduction to Spring Boot**
   - **Evolution of Spring to Spring Boot**: Understanding how Spring Boot simplifies Spring applications, focusing on convention over configuration.
   - **Spring Initializr**: A web-based tool for quickly creating Spring Boot projects with customizable dependencies.
   - **Key Dependencies**:
     - **Web**: Building RESTful web services and web applications.
     - **Actuator**: Providing production-ready features such as monitoring and health checks.
   - **application.properties**: Configuration of application settings in Spring Boot projects.
   - **Spring Boot Project Structure**: Understanding the typical structure of a Spring Boot project and how it facilitates development.

2. **Overview of Cloud-Based IDEs**
   - **GitHub Codespaces**: Cloud-hosted development environments integrated with GitHub, enabling easy setup and collaboration.
   - **Gitpod**: Automating cloud-based development workspaces with pre-configured environments.
   - Advantages of cloud-based IDEs for Spring Boot development: instant setup, collaboration, and scalability.

---

### **Learning Objectives**
By the end of this lecture, students will be able to:
- Describe the evolution of Spring to Spring Boot and how Spring Boot improves application development.
- Use Spring Initializr to create Spring Boot projects with appropriate dependencies.
- Understand and configure application properties using `application.properties` in Spring Boot.
- Identify the key components and structure of a typical Spring Boot project.
- Compare GitHub Codespaces and Gitpod, and explain how cloud-based IDEs enhance Spring Boot development workflows.

---

### **Student/Review Questions**
1. What are the key differences between traditional Spring and Spring Boot?
2. How does Spring Initializr simplify the creation of Spring Boot projects, and what are some essential dependencies you might include?
3. What role does the `application.properties` file play in a Spring Boot project?
4. What can you derive from the following code snippet:
```java
	@GetMapping("/hello/{name}")
	public String sayHelloWithParameter(@PathVariable String name){

		return "Hallo, "+name;

	}
```
5. How does GitHub Codespaces or Gitpod make it easier to develop Spring Boot applications in a cloud environment?
6. What are the key benefits of using a cloud-based IDE over a local development environment for any kind of development?

---

### **Suggested Reading & Resources**
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Initializr](https://start.spring.io/)
- [Spring Boot Actuator Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html)
- [GitHub Codespaces Documentation](https://github.com/features/codespaces)
- [Gitpod Documentation](https://www.gitpod.io/docs)
- [Baeldung Actuator](https://www.baeldung.com/spring-boot-actuator-enable-endpoints)

### Homework
- Build a Spring Boot Hello, World REST API Project using Codespaces or GitPod

## **2024 / 10 / 25 - Containers**
### Content Overview

1. Development in distributed teams withouth containers and the potential problems:
   - Polyglot application landscapes are challenging as all work environments need to match all runtime requirements for all languages
   - Transporting application from environment A to environment B introduces challenges and problems with mismatching runtimes

2. **Containers**
   - Isolate Applications from each other
   - Package Applications along with all Runtime requirements for easy execution and transportation between working environments
   - Simplify configuration of working environments -> only container engine needed
   - handling of all application containers through same mechanisms: docker build, docker run

3. **Docker**
   - Docker ecosystem consists of the Docker Daemon, Docker CLI and Docker Hub+
   - Creation of Dockerfiles
   - Building Images
   - Running Containers

4. **Exercises**
   - Exercises can be found at: https://lecture.new.trainings.nvtc.io/basics/container/

### **Student/Review Questions**
1. What is Docker, and how does it differ from traditional virtual machines?
2. Explain the concept of a Docker image and a Docker container. How are they related?
3. What are the main components of a Dockerfile? Describe the purpose of each component.
4. How does Docker ensure isolation and security between containers?
5. What is a container registry, and how do you use Docker Hub to share or deploy images?
6. Describe the process of building and running a containerized application using Docker, including common commands.

### Homework
- Get a Dockerhub account
- Work through the exercises

## **2024 / 11 / 08 - Cloud-Native Theory and Persistence **  

### **Content Overview**

1. **Distributed Systems Theory**
   - **CAP Theorem**: Understanding the trade-offs between Consistency, Availability, and Partition Tolerance in distributed systems.
   - **Conway's Law**: Exploring how software design reflects organizational structure and its implications for distributed systems.
   - **12-Factor Applications**: Best practices for building scalable, maintainable applications, focusing on principles like configuration, dependencies, and logging.
   - **Microservices**: Basic concept of microservices, its advantages, and challenges in distributed systems.

 2. **Introduction to Persistence, ORM, Spring Data, and Spring Data JPA**
   - **Persistence and ORM**: Discussed the importance of persistence for long-term data storage, introducing ORM as a way to map objects to relational database tables seamlessly.
   - **Spring Data JPA**: Explored how Spring Data JPA simplifies data access through repository interfaces, enabling easy CRUD operations and custom queries without boilerplate code.

---

### **Learning Objectives**
By the end of this lecture, students will be able to:

- Describe the CAP Theorem, its components, and how it affects design choices in distributed systems.
- Explain Conway’s Law and its influence on software architecture, especially in the context of microservices.
- List and apply the 12 factors for building scalable, portable, and maintainable applications.
- Define and differentiate microservices architecture from other architectural styles.

- Explain the concepts of **persistence** and **ORM** and identify their importance in distributed, database-driven applications.
- Set up **Spring Data JPA** to interact with a relational database and configure it using Docker Compose.

### **ABOVE ALL**

Be able to relate the concepts of CAP theorem and the 12-factor apps to the technologies we are covering in the lecture,
e.g. how do technologies like Spring Boot (or other frameworks/languages), Docker, Kubernetes incorporate or implement those aspects

---

### **Student/Review Questions**
1. What are the components of the CAP Theorem, and why can’t a distributed system fully achieve all three?
2. How does Conway’s Law impact the structure of a distributed system, especially when adopting a microservices architecture?
3. What are the key factors of a 12-factor app, and how do they contribute to application scalability and resilience?
4. Describe microservices concepts and some of its advantages over a monolithic architecture.
5. What is Object-Relational Mapping (ORM), and why is it beneficial for a database-backed application?
6. Explain how Spring Data JPA helps in managing CRUD operations in a database. 

---

### **Suggested Reading & Resources**
- [Understanding the CAP Theorem](https://cs.uwaterloo.ca/~kmsalem/courses/CS848/W16/readings/cap.pdf)
- [Conway’s Law - A Key Consideration in Architecture](https://www.thoughtworks.com/insights/blog/conways-law-and-modern-software-factories)
- [The Twelve-Factor App](https://12factor.net/)
- [Microservices Architecture Documentation](https://microservices.io/patterns/microservices.html)

## **2024 / 11 / 15 - APIs and REST & Distributed Application Development

![REST and multi-application setup](/images/2024_11_15_REST_multi_container.png)

### **Content Overview**

1. **API and REST**  
   - **HTTP Basics**: Core concepts of HTTP for APIs, including request/response structure.  
   - **Introduction to REST**: Understanding the foundational ideas of REST as defined by Roy Fielding and how RESTful APIs communicate.  
   - **Nouns and Verbs**: Structuring REST APIs around resources (nouns) and actions (verbs).  
   - **Representation**: Data formats in REST (e.g., JSON, XML) and the role of content negotiation.  
   - **HTTP Return Codes**: Standard HTTP status codes, their meanings, and when to use each in API responses.  
   - **Idempotency**: Ensuring repeatable requests yield the same results to prevent unintended side effects.  
   - **Richardson's Maturity Model**: Levels of RESTful maturity, from Level 0 (HTTP as a tunnel) to Level 3 (HATEOAS), to understand API design progression.  
   - **OpenAPI and Swagger**: Using OpenAPI for defining APIs, ensuring consistency, and employing Swagger UI for visualization and testing.

2. **Docker-Compose for Multi-Component Applications**  
   - Setting up multi-component applications using Docker Compose, integrating backend APIs, databases, and frontends in a single `docker-compose.yml` file.  
   - Configuration of service communication, externalized settings, and container networking to simplify deployment and scaling.

---

### **Objectives and Exercises**

*Students should be able to:*

- Describe the foundational principles of REST and explain the HTTP concepts that underpin REST APIs.  
- Use OpenAPI to define REST APIs and visualize them with Swagger UI.  
- Create and configure a Docker Compose file to integrate multiple application components and enable effective communication between services.  

---

### **Student/Review Questions**

1. **What are the core principles of REST, and how do they align with HTTP concepts?**  
2. **Explain the importance of structuring REST APIs around resources (nouns) and actions (verbs). Provide examples.**  
3. **What is Richardson’s Maturity Model, and how does it help assess the maturity of a REST API?**  
4. **Why is idempotency important in REST APIs? Give an example of an idempotent and a non-idempotent HTTP method.**  
5. **Describe the advantages of using OpenAPI for REST API documentation.**  
6. **How does Docker Compose enable multi-component application setups, and what are the benefits of externalized configuration?**  
7. **Explain the role of container networking in Docker Compose and how it facilitates service communication.**

---

## **HOMEWORK!!**

- Watch the recordings from the previous session - priority on cloud-native theory!

### **Suggested Reading & Resources**

- [Roy Fielding’s REST Dissertation](https://www.ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm)
- [HTTP Status Codes](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)
- [Richardson's Maturity Model](https://martinfowler.com/articles/richardsonMaturityModel.html)

## **2024 / 11 / 22 - Docker Network, Volumes & Compose**

![Polyglot Container App](/images/2024_11_22_Polyglot_Container_App.png)

### Docker Advanced: Networks, Volumes, and Compose  

### **Content Overview**  

This lecture explores advanced Docker features that are essential for managing containerized applications in cloud-native environments. Students will learn about Docker networking modes, data persistence with volumes, and orchestrating multi-container applications using Docker Compose. By mastering these topics, students will be able to design, deploy, and manage robust containerized systems effectively.  

---  
      
### **Learning Objectives**  

By the end of this lecture, students will be able to:  
1. Explain Docker's network modes and create custom networks to manage container communication.  
2. Differentiate between bind mounts and named volumes, and apply them for persistent data storage.  
3. Design and implement multi-container applications using Docker Compose.  
4. Optimize container setups by combining networking and volume management best practices.  

---  

### **Student/Review Questions**  

1. What are the main differences between Docker’s bridge and host network modes?  
2. How does a named volume differ from a bind mount, and when should each be used?  
3. In a `docker-compose.yml` file, how do you define a custom network and attach services to it?  
4. What is the purpose of Docker’s internal DNS service, and how does it enhance container communication?  
5. How can you persist data for a containerized database across container restarts?

---

### **Exercises**  
1. **Networking Practice**:  
   - Create a custom Docker network and deploy two containers to communicate within it.  
   - Verify connectivity using tools like `ping` and DNS resolution.  

2. **Volume Management**:  
   - Set up named volumes for a container to persist data.  
   - Demonstrate sharing a volume between multiple containers.  

3. **Compose Application**:  
   - Build and deploy a web application with a backend database using Docker Compose.  
   - Define networks and volumes in the `docker-compose.yml` file.  

## **2024 / 11 / 29 - No lecture - Projektwoche**

## **2024 / 12 / 06 - Kubernetes Introduction**

### **Content Overview**

1. **Introduction to Kubernetes**  
   - **What is Kubernetes?**: High-level overview of Kubernetes as a container orchestration platform.  
   - **Why Kubernetes?**: Key benefits, including scalability, fault tolerance, and management of containerized applications.  

2. **Kubernetes Cluster Architecture**  
   - **Control Plane and Worker Nodes**: Explanation of the roles and responsibilities of the control plane and worker nodes in a Kubernetes cluster.  
   - **Key Components**: Overview of critical components like `kube-apiserver`, `etcd`, `kube-scheduler`, `kube-controller-manager`, and `kubelet`.  

![Kubernetes High Level Architecture](images/2024_11_11_kubernetes_architecture.png)

3. **Declarative Working Mode**  
   - **Configuration as Code**: Introduction to Kubernetes' declarative approach for managing application state using YAML manifests.  
   - **Reconciliation Loop**: How Kubernetes ensures desired state matches the actual state through its control loop.  

4. **Most Important API Objects**  
   - **Pods**: The smallest deployable unit in Kubernetes, representing one or more containers.  
   - **ReplicaSets**: Ensuring the desired number of pod replicas are running.  
   - **Deployments**: Managing updates and rollbacks for applications.  
   - **Services**: Enabling communication between pods and exposing applications to external users.

---

### **Objectives and Exercises**

*Students should be able to:*

- Explain what Kubernetes is, why it is used, and its primary benefits.  
- Describe the architecture of a Kubernetes cluster and the roles of its key components.  
- Demonstrate understanding of the declarative approach for managing applications in Kubernetes.  
- Identify and explain the purpose of key Kubernetes API objects, including pods, ReplicaSets, deployments, and services.  

---

### **Student/Review Questions**

1. **What is Kubernetes, and why is it essential for managing containerized applications?**  
2. **Describe the roles of the control plane and worker nodes in a Kubernetes cluster.**  
3. **What is the function of the `kube-apiserver` and `etcd` in Kubernetes?**  
4. **Explain Kubernetes’ declarative working mode. How does the reconciliation loop ensure consistency?**  
5. **What is a pod in Kubernetes, and how does it differ from a container?**  
6. **How do ReplicaSets help ensure application reliability?**  
7. **What are deployments in Kubernetes, and how do they simplify updates and rollbacks?**  
8. **How do services in Kubernetes enable communication between pods and expose applications externally?**

## **2024-12-13 Kubernetes in Action ##

### Different ways to access a Kubernetes environment (Public Cloud, Codespace, local (Kind, Minikube,...))

![Different Kubernetes Offerings](https://github.com/maeddes/hse-24-winter/blob/main/images/2024_12_02_Kubernetes_Options.png)

### Recap and relationship of important API objects

![K8s objects relationships](images/2024_12_13_Kubernetes_API_Object_Relationships.png)

### Defining a multi-application Kubernetes configuration - making things run and communicate

![K8s multi object definition](images/2024_12_13_Kubernetes_Multi_App_Definition.png)