# 

## Model
www.msaez.io/#/86237798/storming/581a84ae72a260690d508dad44b55a91

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- usermanagement
- chatbot
- post
- projectmanagement
- attachment
- comment
- invite
- boundedcontext3516049382716049
- boundedcontext3293827160493827
- boundedcontext40572015456211416


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- usermanagement
```
 http :8088/users userId="userId"email="email"password="password"name="name"profileImage="profileImage"position="position"role="role"projectId="projectId"status="status"
```
- chatbot
```
```
- post
```
 http :8088/posts postId="postId"title="title"content="content"viewCount="viewCount"createdAt="createdAt"updatedAt="updatedAt"userId="userId"
```
- projectmanagement
```
 http :8088/projectManagements projectId="projectId"projectName="projectName"projectDescription="projectDescription"
```
- attachment
```
 http :8088/attachments fileId="fileId"postId="postId"originalName="originalName"storedName="storedName"fileUrl="fileUrl"fileSize="fileSize"fileType="fileType"createdAt="createdAt"
```
- comment
```
 http :8088/comments commentId="commentId"content="content"createdAt="createdAt"updatedAt="updatedAt"postId="postId"userId="userId"
```
- invite
```
 http :8088/invites id="id"userid="userid"email="email"
```
- boundedcontext3516049382716049
```
 http :8088/ 
```
- boundedcontext3293827160493827
```
 http :8088/ 
```
- boundedcontext40572015456211416
```
 http :8088/ 
 http :8088/ 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```
