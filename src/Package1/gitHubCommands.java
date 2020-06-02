package Package1;

public class gitHubCommands {
    /*
    cd ../..   --> delete and go back to user
    cd         --> change directory
    ls         --> list (mac)
    dir        --> directory (windows, linux)
    clear      --> delete everything
    git status --> which files has changed or created
    git add *  --> adding the files which you want to commit
                   * (star) is adding all files
                   bu ayrinti muhim albayim, * ile add arasinda bi space var
                   SANIRSAM BU CODE WINDOWS, mac'de denedim commit etmedi

     git add . --> adding the files which you want to commit
                   albayim bu sondaki nokta(.) mac icin, test ettim calisiyor
                    arada bi bosluk birakiyoruz, unutmayalim albayim.

     git commit - m 'your message' --> committing the changes for the
                                      pushing to code to github

      git push      --> pushing the code to github


      add remote --> connecting intellij project with git repo
                     git remote add <ProjectName> <gitURL>

      git remote add <name> <url> --> bura mohim albayim, push etmek icin kullandigimiz code bu
                                      en basit haliyle bi code yazarak intellij e diyoruz ki bak
                                      kodlari push edecegin reponun linki bu.

      SAMPLE: git remote add ProjectGit5 https://github.com/vivolric/ProjectGit5.git

      bunu yazip enter a basiyoruz, ve yine sadece 'git remote' yaziyoruz.
      terminal bize github daki repo nun adini verecek.



      git branch    --> which branches are available

      connect local branch to remote branch --> connecting local branch to github branch
      git push --set-upstream <nameOfPrpject> <nameOfBranch>

      NOTE: Create a branch and after commit checkout on master.
            Create a remote branchàgit push -u ProjectName LocalBranchName:RemoteBranchName









     */
}
