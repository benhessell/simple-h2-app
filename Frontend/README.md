# Front End for SimpleH2App
note - currently no FE set up

### Set Up
To install dependencies do 'yarn', not npm install.
To add a dependency use 'yarn add xxxx' or 'yarn add --dev xxxx', not npm install xxxx.
Might need to install serve globally to test the build state (yarn global add serve)

### Scripts
-build -> builds
-start -> uses webpack serve and then opens
-build-run -> builds and then opens built code locally to test built state
-test -> run Jest and execute the tests
-test:watch -> run all test on watch mode, so if you make changes to tests, it will execute them again.
-test:coverage -> generate coverage report on all tests it executes 

### Routing
Currenntly using Hash Routing to deploy easier, to change to Browser routing just change the import from HashRouter to BrowserRouter, then remove the # in front of each route link anchor