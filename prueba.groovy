project_name = "jenkins-pipeline"
repo = "https://github.com/videocursoscloud/test-jenkins-1.git"
repo_name = "repo"

pipelineJob(project_name){
	definition{
		triggers{
			scm('H/1 * * * *')
		}

		cpsScm{
			scan{
				git{
					remote{
						name(repo_name)
						url(repo)
					}
				}
				scriptPath("Jenkinsfile")
			}

		}
	}
}
