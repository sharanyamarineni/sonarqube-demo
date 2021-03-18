# sonarqube-demo

 Download sonarqube zip file and extract it.
 Open directory -> bin -> linux -> open terminal.
 Run the command: ./sonar.sh start
 
### check sonarqube in local
 localhost:9000

### add dependency and plugin to integrate sonarqube with our application
```
<dependency>
			<groupId>org.sonarsource.scanner.maven</groupId>
			<artifactId>sonar-maven-plugin</artifactId>
			<version>3.8.0.2131</version>
</dependency>
```

### add properties of sonarqube
```
<sonar.projectKey>sonar6</sonar.projectKey>
<sonar.host.url>http://localhost:9000</sonar.host.url>
<sonar.login>3b3b8ff4fd1211105d9fa96cbc6aea1ae441a503</sonar.login>
```

### add a plugin to generate report
```
<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.6</version>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
```


