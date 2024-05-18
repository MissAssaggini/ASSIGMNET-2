////////////////////////////////////////////////////////////////////
// Arianna Piva 2076427
// Nicholas Salmaso 2080038
////////////////////////////////////////////////////////////////////

Processo di build:
﻿2024-05-18T07:47:33.7700950Z Current runner version: '2.316.1'
2024-05-18T07:47:33.7726100Z ##[group]Operating System
2024-05-18T07:47:33.7726906Z Ubuntu
2024-05-18T07:47:33.7727259Z 22.04.4
2024-05-18T07:47:33.7727549Z LTS
2024-05-18T07:47:33.7727985Z ##[endgroup]
2024-05-18T07:47:33.7728329Z ##[group]Runner Image
2024-05-18T07:47:33.7728750Z Image: ubuntu-22.04
2024-05-18T07:47:33.7729232Z Version: 20240516.1.0
2024-05-18T07:47:33.7730212Z Included Software: https://github.com/actions/runner-images/blob/ubuntu22/20240516.1/images/ubuntu/Ubuntu2204-Readme.md
2024-05-18T07:47:33.7731634Z Image Release: https://github.com/actions/runner-images/releases/tag/ubuntu22%2F20240516.1
2024-05-18T07:47:33.7732576Z ##[endgroup]
2024-05-18T07:47:33.7732980Z ##[group]Runner Image Provisioner
2024-05-18T07:47:33.7733469Z 2.0.369.1
2024-05-18T07:47:33.7733872Z ##[endgroup]
2024-05-18T07:47:33.7734844Z ##[group]GITHUB_TOKEN Permissions
2024-05-18T07:47:33.7736494Z Contents: read
2024-05-18T07:47:33.7736919Z Metadata: read
2024-05-18T07:47:33.7737593Z Packages: read
2024-05-18T07:47:33.7738049Z ##[endgroup]
2024-05-18T07:47:33.7741214Z Secret source: Actions
2024-05-18T07:47:33.7741939Z Prepare workflow directory
2024-05-18T07:47:33.8389161Z Prepare all required actions
2024-05-18T07:47:33.8550490Z Getting action download info
2024-05-18T07:47:34.0013698Z Download action repository 'actions/checkout@v3' (SHA:f43a0e5ff2bd294095638e18286ca9a3d1956744)
2024-05-18T07:47:34.1262166Z Download action repository 'actions/setup-java@v3' (SHA:0ab4596768b603586c0de567f2430c30f5b0d2b0)
2024-05-18T07:47:34.5689540Z Complete job name: build
2024-05-18T07:47:34.6620815Z ##[group]Run actions/checkout@v3
2024-05-18T07:47:34.6621439Z with:
2024-05-18T07:47:34.6621844Z   repository: MissAssaggini/ASSIGMNET-2
2024-05-18T07:47:34.6622708Z   token: ***
2024-05-18T07:47:34.6623119Z   ssh-strict: true
2024-05-18T07:47:34.6623549Z   persist-credentials: true
2024-05-18T07:47:34.6624083Z   clean: true
2024-05-18T07:47:34.6624495Z   sparse-checkout-cone-mode: true
2024-05-18T07:47:34.6625010Z   fetch-depth: 1
2024-05-18T07:47:34.6625438Z   fetch-tags: false
2024-05-18T07:47:34.6625827Z   lfs: false
2024-05-18T07:47:34.6626201Z   submodules: false
2024-05-18T07:47:34.6626626Z   set-safe-directory: true
2024-05-18T07:47:34.6627065Z ##[endgroup]
2024-05-18T07:47:34.8527181Z Syncing repository: MissAssaggini/ASSIGMNET-2
2024-05-18T07:47:34.8530382Z ##[group]Getting Git version info
2024-05-18T07:47:34.8531874Z Working directory is '/home/runner/work/ASSIGMNET-2/ASSIGMNET-2'
2024-05-18T07:47:34.8533670Z [command]/usr/bin/git version
2024-05-18T07:47:34.8534850Z git version 2.45.1
2024-05-18T07:47:34.8540423Z ##[endgroup]
2024-05-18T07:47:34.8561361Z Temporarily overriding HOME='/home/runner/work/_temp/3a38498f-b70d-43d8-b6a1-5e6c550ed637' before making global git config changes
2024-05-18T07:47:34.8563763Z Adding repository directory to the temporary git global config as a safe directory
2024-05-18T07:47:34.8566463Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/ASSIGMNET-2/ASSIGMNET-2
2024-05-18T07:47:34.8621420Z Deleting the contents of '/home/runner/work/ASSIGMNET-2/ASSIGMNET-2'
2024-05-18T07:47:34.8627411Z ##[group]Initializing the repository
2024-05-18T07:47:34.8632820Z [command]/usr/bin/git init /home/runner/work/ASSIGMNET-2/ASSIGMNET-2
2024-05-18T07:47:34.8728347Z hint: Using 'master' as the name for the initial branch. This default branch name
2024-05-18T07:47:34.8730498Z hint: is subject to change. To configure the initial branch name to use in all
2024-05-18T07:47:34.8732179Z hint: of your new repositories, which will suppress this warning, call:
2024-05-18T07:47:34.8733454Z hint:
2024-05-18T07:47:34.8734064Z hint: 	git config --global init.defaultBranch <name>
2024-05-18T07:47:34.8734686Z hint:
2024-05-18T07:47:34.8735818Z hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
2024-05-18T07:47:34.8737006Z hint: 'development'. The just-created branch can be renamed via this command:
2024-05-18T07:47:34.8737769Z hint:
2024-05-18T07:47:34.8738576Z hint: 	git branch -m <name>
2024-05-18T07:47:34.8739419Z Initialized empty Git repository in /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/.git/
2024-05-18T07:47:34.8743868Z [command]/usr/bin/git remote add origin https://github.com/MissAssaggini/ASSIGMNET-2
2024-05-18T07:47:34.8793341Z ##[endgroup]
2024-05-18T07:47:34.8794364Z ##[group]Disabling automatic garbage collection
2024-05-18T07:47:34.8800043Z [command]/usr/bin/git config --local gc.auto 0
2024-05-18T07:47:34.8838969Z ##[endgroup]
2024-05-18T07:47:34.8840136Z ##[group]Setting up auth
2024-05-18T07:47:34.8845500Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2024-05-18T07:47:34.8883780Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2024-05-18T07:47:34.9236839Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2024-05-18T07:47:34.9274852Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2024-05-18T07:47:34.9535265Z [command]/usr/bin/git config --local http.https://github.com/.extraheader AUTHORIZATION: basic ***
2024-05-18T07:47:34.9581620Z ##[endgroup]
2024-05-18T07:47:34.9582875Z ##[group]Fetching the repository
2024-05-18T07:47:34.9593231Z [command]/usr/bin/git -c protocol.version=2 fetch --no-tags --prune --progress --no-recurse-submodules --depth=1 origin +9bbf91eb3bd115c9aca52f13ab96268bc1c60910:refs/remotes/origin/main
2024-05-18T07:47:35.1313457Z remote: Enumerating objects: 88, done.        
2024-05-18T07:47:35.1316186Z remote: Counting objects:   1% (1/88)        
2024-05-18T07:47:35.1317375Z remote: Counting objects:   2% (2/88)        
2024-05-18T07:47:35.1318996Z remote: Counting objects:   3% (3/88)        
2024-05-18T07:47:35.1320189Z remote: Counting objects:   4% (4/88)        
2024-05-18T07:47:35.1321237Z remote: Counting objects:   5% (5/88)        
2024-05-18T07:47:35.1321999Z remote: Counting objects:   6% (6/88)        
2024-05-18T07:47:35.1322696Z remote: Counting objects:   7% (7/88)        
2024-05-18T07:47:35.1323324Z remote: Counting objects:   9% (8/88)        
2024-05-18T07:47:35.1324004Z remote: Counting objects:  10% (9/88)        
2024-05-18T07:47:35.1324680Z remote: Counting objects:  11% (10/88)        
2024-05-18T07:47:35.1325335Z remote: Counting objects:  12% (11/88)        
2024-05-18T07:47:35.1326021Z remote: Counting objects:  13% (12/88)        
2024-05-18T07:47:35.1326683Z remote: Counting objects:  14% (13/88)        
2024-05-18T07:47:35.1327360Z remote: Counting objects:  15% (14/88)        
2024-05-18T07:47:35.1328071Z remote: Counting objects:  17% (15/88)        
2024-05-18T07:47:35.1328709Z remote: Counting objects:  18% (16/88)        
2024-05-18T07:47:35.1329328Z remote: Counting objects:  19% (17/88)        
2024-05-18T07:47:35.1330026Z remote: Counting objects:  20% (18/88)        
2024-05-18T07:47:35.1330644Z remote: Counting objects:  21% (19/88)        
2024-05-18T07:47:35.1331256Z remote: Counting objects:  22% (20/88)        
2024-05-18T07:47:35.1331954Z remote: Counting objects:  23% (21/88)        
2024-05-18T07:47:35.1332529Z remote: Counting objects:  25% (22/88)        
2024-05-18T07:47:35.1333136Z remote: Counting objects:  26% (23/88)        
2024-05-18T07:47:35.1333817Z remote: Counting objects:  27% (24/88)        
2024-05-18T07:47:35.1334402Z remote: Counting objects:  28% (25/88)        
2024-05-18T07:47:35.1335017Z remote: Counting objects:  29% (26/88)        
2024-05-18T07:47:35.1335708Z remote: Counting objects:  30% (27/88)        
2024-05-18T07:47:35.1336283Z remote: Counting objects:  31% (28/88)        
2024-05-18T07:47:35.1336987Z remote: Counting objects:  32% (29/88)        
2024-05-18T07:47:35.1337905Z remote: Counting objects:  34% (30/88)        
2024-05-18T07:47:35.1338497Z remote: Counting objects:  35% (31/88)        
2024-05-18T07:47:35.1339573Z remote: Counting objects:  36% (32/88)        
2024-05-18T07:47:35.1340281Z remote: Counting objects:  37% (33/88)        
2024-05-18T07:47:35.1340855Z remote: Counting objects:  38% (34/88)        
2024-05-18T07:47:35.1341475Z remote: Counting objects:  39% (35/88)        
2024-05-18T07:47:35.1342153Z remote: Counting objects:  40% (36/88)        
2024-05-18T07:47:35.1342732Z remote: Counting objects:  42% (37/88)        
2024-05-18T07:47:35.1343352Z remote: Counting objects:  43% (38/88)        
2024-05-18T07:47:35.1344038Z remote: Counting objects:  44% (39/88)        
2024-05-18T07:47:35.1344627Z remote: Counting objects:  45% (40/88)        
2024-05-18T07:47:35.1345254Z remote: Counting objects:  46% (41/88)        
2024-05-18T07:47:35.1345938Z remote: Counting objects:  47% (42/88)        
2024-05-18T07:47:35.1346525Z remote: Counting objects:  48% (43/88)        
2024-05-18T07:47:35.1347130Z remote: Counting objects:  50% (44/88)        
2024-05-18T07:47:35.1347818Z remote: Counting objects:  51% (45/88)        
2024-05-18T07:47:35.1348486Z remote: Counting objects:  52% (46/88)        
2024-05-18T07:47:35.1349074Z remote: Counting objects:  53% (47/88)        
2024-05-18T07:47:35.1349748Z remote: Counting objects:  54% (48/88)        
2024-05-18T07:47:35.1350370Z remote: Counting objects:  55% (49/88)        
2024-05-18T07:47:35.1350934Z remote: Counting objects:  56% (50/88)        
2024-05-18T07:47:35.1351623Z remote: Counting objects:  57% (51/88)        
2024-05-18T07:47:35.1352467Z remote: Counting objects:  59% (52/88)        
2024-05-18T07:47:35.1353099Z remote: Counting objects:  60% (53/88)        
2024-05-18T07:47:35.1353822Z remote: Counting objects:  61% (54/88)        
2024-05-18T07:47:35.1354428Z remote: Counting objects:  62% (55/88)        
2024-05-18T07:47:35.1355000Z remote: Counting objects:  63% (56/88)        
2024-05-18T07:47:35.1355691Z remote: Counting objects:  64% (57/88)        
2024-05-18T07:47:35.1356296Z remote: Counting objects:  65% (58/88)        
2024-05-18T07:47:35.1356876Z remote: Counting objects:  67% (59/88)        
2024-05-18T07:47:35.1357837Z remote: Counting objects:  68% (60/88)        
2024-05-18T07:47:35.1358508Z remote: Counting objects:  69% (61/88)        
2024-05-18T07:47:35.1359103Z remote: Counting objects:  70% (62/88)        
2024-05-18T07:47:35.1359802Z remote: Counting objects:  71% (63/88)        
2024-05-18T07:47:35.1360435Z remote: Counting objects:  72% (64/88)        
2024-05-18T07:47:35.1361297Z remote: Counting objects:  73% (65/88)        
2024-05-18T07:47:35.1361894Z remote: Counting objects:  75% (66/88)        
2024-05-18T07:47:35.1362505Z remote: Counting objects:  76% (67/88)        
2024-05-18T07:47:35.1363719Z remote: Counting objects:  77% (68/88)        
2024-05-18T07:47:35.1364581Z remote: Counting objects:  78% (69/88)        
2024-05-18T07:47:35.1365238Z remote: Counting objects:  79% (70/88)        
2024-05-18T07:47:35.1367268Z remote: Counting objects:  80% (71/88)        
2024-05-18T07:47:35.1368009Z remote: Counting objects:  81% (72/88)        
2024-05-18T07:47:35.1368630Z remote: Counting objects:  82% (73/88)        
2024-05-18T07:47:35.1369334Z remote: Counting objects:  84% (74/88)        
2024-05-18T07:47:35.1369966Z remote: Counting objects:  85% (75/88)        
2024-05-18T07:47:35.1371718Z remote: Counting objects:  86% (76/88)        
2024-05-18T07:47:35.1372591Z remote: Counting objects:  87% (77/88)        
2024-05-18T07:47:35.1373246Z remote: Counting objects:  88% (78/88)        
2024-05-18T07:47:35.1373861Z remote: Counting objects:  89% (79/88)        
2024-05-18T07:47:35.1374736Z remote: Counting objects:  90% (80/88)        
2024-05-18T07:47:35.1375715Z remote: Counting objects:  92% (81/88)        
2024-05-18T07:47:35.1376430Z remote: Counting objects:  93% (82/88)        
2024-05-18T07:47:35.1377303Z remote: Counting objects:  94% (83/88)        
2024-05-18T07:47:35.1378071Z remote: Counting objects:  95% (84/88)        
2024-05-18T07:47:35.1378817Z remote: Counting objects:  96% (85/88)        
2024-05-18T07:47:35.1380031Z remote: Counting objects:  97% (86/88)        
2024-05-18T07:47:35.1380792Z remote: Counting objects:  98% (87/88)        
2024-05-18T07:47:35.1381505Z remote: Counting objects: 100% (88/88)        
2024-05-18T07:47:35.1382522Z remote: Counting objects: 100% (88/88), done.        
2024-05-18T07:47:35.1383423Z remote: Compressing objects:   1% (1/60)        
2024-05-18T07:47:35.1384129Z remote: Compressing objects:   3% (2/60)        
2024-05-18T07:47:35.1385019Z remote: Compressing objects:   5% (3/60)        
2024-05-18T07:47:35.1385870Z remote: Compressing objects:   6% (4/60)        
2024-05-18T07:47:35.1386546Z remote: Compressing objects:   8% (5/60)        
2024-05-18T07:47:35.1387634Z remote: Compressing objects:  10% (6/60)        
2024-05-18T07:47:35.1388466Z remote: Compressing objects:  11% (7/60)        
2024-05-18T07:47:35.1389243Z remote: Compressing objects:  13% (8/60)        
2024-05-18T07:47:35.1390073Z remote: Compressing objects:  15% (9/60)        
2024-05-18T07:47:35.1390964Z remote: Compressing objects:  16% (10/60)        
2024-05-18T07:47:35.1391755Z remote: Compressing objects:  18% (11/60)        
2024-05-18T07:47:35.1392573Z remote: Compressing objects:  20% (12/60)        
2024-05-18T07:47:35.1393582Z remote: Compressing objects:  21% (13/60)        
2024-05-18T07:47:35.1394277Z remote: Compressing objects:  23% (14/60)        
2024-05-18T07:47:35.1394995Z remote: Compressing objects:  25% (15/60)        
2024-05-18T07:47:35.1395698Z remote: Compressing objects:  26% (16/60)        
2024-05-18T07:47:35.1396548Z remote: Compressing objects:  28% (17/60)        
2024-05-18T07:47:35.1397432Z remote: Compressing objects:  30% (18/60)        
2024-05-18T07:47:35.1398477Z remote: Compressing objects:  31% (19/60)        
2024-05-18T07:47:35.1399162Z remote: Compressing objects:  33% (20/60)        
2024-05-18T07:47:35.1399944Z remote: Compressing objects:  35% (21/60)        
2024-05-18T07:47:35.1400569Z remote: Compressing objects:  36% (22/60)        
2024-05-18T07:47:35.1401371Z remote: Compressing objects:  38% (23/60)        
2024-05-18T07:47:35.1402111Z remote: Compressing objects:  40% (24/60)        
2024-05-18T07:47:35.1402732Z remote: Compressing objects:  41% (25/60)        
2024-05-18T07:47:35.1403409Z remote: Compressing objects:  43% (26/60)        
2024-05-18T07:47:35.1404133Z remote: Compressing objects:  45% (27/60)        
2024-05-18T07:47:35.1404756Z remote: Compressing objects:  46% (28/60)        
2024-05-18T07:47:35.1405439Z remote: Compressing objects:  48% (29/60)        
2024-05-18T07:47:35.1406157Z remote: Compressing objects:  50% (30/60)        
2024-05-18T07:47:35.1406774Z remote: Compressing objects:  51% (31/60)        
2024-05-18T07:47:35.1407444Z remote: Compressing objects:  53% (32/60)        
2024-05-18T07:47:35.1408153Z remote: Compressing objects:  55% (33/60)        
2024-05-18T07:47:35.1408767Z remote: Compressing objects:  56% (34/60)        
2024-05-18T07:47:35.1409428Z remote: Compressing objects:  58% (35/60)        
2024-05-18T07:47:35.1410149Z remote: Compressing objects:  60% (36/60)        
2024-05-18T07:47:35.1410762Z remote: Compressing objects:  61% (37/60)        
2024-05-18T07:47:35.1411421Z remote: Compressing objects:  63% (38/60)        
2024-05-18T07:47:35.1412148Z remote: Compressing objects:  65% (39/60)        
2024-05-18T07:47:35.1412829Z remote: Compressing objects:  66% (40/60)        
2024-05-18T07:47:35.1413435Z remote: Compressing objects:  68% (41/60)        
2024-05-18T07:47:35.1414368Z remote: Compressing objects:  70% (42/60)        
2024-05-18T07:47:35.1415108Z remote: Compressing objects:  71% (43/60)        
2024-05-18T07:47:35.1415822Z remote: Compressing objects:  73% (44/60)        
2024-05-18T07:47:35.1416606Z remote: Compressing objects:  75% (45/60)        
2024-05-18T07:47:35.1417270Z remote: Compressing objects:  76% (46/60)        
2024-05-18T07:47:35.1418113Z remote: Compressing objects:  78% (47/60)        
2024-05-18T07:47:35.1418928Z remote: Compressing objects:  80% (48/60)        
2024-05-18T07:47:35.1420239Z remote: Compressing objects:  81% (49/60)        
2024-05-18T07:47:35.1423803Z remote: Compressing objects:  83% (50/60)        
2024-05-18T07:47:35.1425320Z remote: Compressing objects:  85% (51/60)        
2024-05-18T07:47:35.1426365Z remote: Compressing objects:  86% (52/60)        
2024-05-18T07:47:35.1427348Z remote: Compressing objects:  88% (53/60)        
2024-05-18T07:47:35.1428516Z remote: Compressing objects:  90% (54/60)        
2024-05-18T07:47:35.1429581Z remote: Compressing objects:  91% (55/60)        
2024-05-18T07:47:35.1430575Z remote: Compressing objects:  93% (56/60)        
2024-05-18T07:47:35.1431730Z remote: Compressing objects:  95% (57/60)        
2024-05-18T07:47:35.1432749Z remote: Compressing objects:  96% (58/60)        
2024-05-18T07:47:35.1433784Z remote: Compressing objects:  98% (59/60)        
2024-05-18T07:47:35.1434876Z remote: Compressing objects: 100% (60/60)        
2024-05-18T07:47:35.1435979Z remote: Compressing objects: 100% (60/60), done.        
2024-05-18T07:47:35.1438077Z remote: Total 88 (delta 13), reused 83 (delta 13), pack-reused 0        
2024-05-18T07:47:35.1613795Z From https://github.com/MissAssaggini/ASSIGMNET-2
2024-05-18T07:47:35.1614983Z  * [new ref]         9bbf91eb3bd115c9aca52f13ab96268bc1c60910 -> origin/main
2024-05-18T07:47:35.1641179Z ##[endgroup]
2024-05-18T07:47:35.1643018Z ##[group]Determining the checkout info
2024-05-18T07:47:35.1644546Z ##[endgroup]
2024-05-18T07:47:35.1645858Z ##[group]Checking out the ref
2024-05-18T07:47:35.1649868Z [command]/usr/bin/git checkout --progress --force -B main refs/remotes/origin/main
2024-05-18T07:47:35.1760848Z Switched to a new branch 'main'
2024-05-18T07:47:35.1763809Z branch 'main' set up to track 'origin/main'.
2024-05-18T07:47:35.1770179Z ##[endgroup]
2024-05-18T07:47:35.1818523Z [command]/usr/bin/git log -1 --format='%H'
2024-05-18T07:47:35.1854090Z '9bbf91eb3bd115c9aca52f13ab96268bc1c60910'
2024-05-18T07:47:35.2233309Z ##[group]Run actions/setup-java@v3
2024-05-18T07:47:35.2233958Z with:
2024-05-18T07:47:35.2234304Z   distribution: temurin
2024-05-18T07:47:35.2234967Z   java-version: 8.0.332+9
2024-05-18T07:47:35.2235533Z   cache: maven
2024-05-18T07:47:35.2235943Z   java-package: jdk
2024-05-18T07:47:35.2236448Z   check-latest: false
2024-05-18T07:47:35.2236858Z   server-id: github
2024-05-18T07:47:35.2237280Z   server-username: GITHUB_ACTOR
2024-05-18T07:47:35.2238221Z   server-password: GITHUB_TOKEN
2024-05-18T07:47:35.2238730Z   overwrite-settings: true
2024-05-18T07:47:35.2239196Z   job-status: success
2024-05-18T07:47:35.2239929Z   token: ***
2024-05-18T07:47:35.2240329Z ##[endgroup]
2024-05-18T07:47:35.3965405Z ##[group]Installed distributions
2024-05-18T07:47:35.4012015Z Trying to resolve the latest version from remote
2024-05-18T07:47:35.6004820Z Resolved latest version as 8.0.332+9
2024-05-18T07:47:35.6005983Z Trying to download...
2024-05-18T07:47:35.6008646Z Downloading Java 8.0.332+9 (Temurin-Hotspot) from https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u332-b09/OpenJDK8U-jdk_x64_linux_hotspot_8u332b09.tar.gz ...
2024-05-18T07:47:36.2872917Z Extracting Java archive...
2024-05-18T07:47:36.2998744Z [command]/usr/bin/tar xz --warning=no-unknown-keyword -C /home/runner/work/_temp/7b9dccce-a5af-4aa2-ade4-594ab7677c4f -f /home/runner/work/_temp/7fbd90ff-89b2-40e0-833c-105562951d5f
2024-05-18T07:47:38.0005966Z Java 8.0.332+9 was downloaded
2024-05-18T07:47:38.0006705Z Setting Java 8.0.332+9 as the default
2024-05-18T07:47:38.0026626Z Creating toolchains.xml for JDK version 8.0.332+9 from temurin
2024-05-18T07:47:38.0112510Z Writing to /home/runner/.m2/toolchains.xml
2024-05-18T07:47:38.0114148Z 
2024-05-18T07:47:38.0114444Z Java configuration:
2024-05-18T07:47:38.0117392Z   Distribution: temurin
2024-05-18T07:47:38.0118478Z   Version: 8.0.332+9
2024-05-18T07:47:38.0119928Z   Path: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/8.0.332-9/x64
2024-05-18T07:47:38.0120783Z 
2024-05-18T07:47:38.0121797Z ##[endgroup]
2024-05-18T07:47:38.0143419Z Creating settings.xml with server-id: github
2024-05-18T07:47:38.0143951Z Writing to /home/runner/.m2/settings.xml
2024-05-18T07:47:38.1482908Z maven cache is not found
2024-05-18T07:47:38.1655248Z ##[group]Run mvn -B install --file pom.xml
2024-05-18T07:47:38.1655798Z [36;1mmvn -B install --file pom.xml[0m
2024-05-18T07:47:38.1743288Z shell: /usr/bin/bash -e {0}
2024-05-18T07:47:38.1743679Z env:
2024-05-18T07:47:38.1744158Z   JAVA_HOME: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/8.0.332-9/x64
2024-05-18T07:47:38.1745008Z   JAVA_HOME_8_X64: /opt/hostedtoolcache/Java_Temurin-Hotspot_jdk/8.0.332-9/x64
2024-05-18T07:47:38.1745576Z ##[endgroup]
2024-05-18T07:47:39.1394723Z [INFO] Scanning for projects...
2024-05-18T07:47:39.1834788Z [INFO] 
2024-05-18T07:47:39.1835976Z [INFO] ---------------------< it.unipd.mtss:roman-number >---------------------
2024-05-18T07:47:39.1836889Z [INFO] Building roman-number 1.0-SNAPSHOT
2024-05-18T07:47:39.1837977Z [INFO]   from pom.xml
2024-05-18T07:47:39.1838887Z [INFO] --------------------------------[ jar ]---------------------------------
2024-05-18T07:47:39.3772309Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.pom
2024-05-18T07:47:39.6783849Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.pom (7.1 kB at 23 kB/s)
2024-05-18T07:47:39.6909692Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/30/maven-plugins-30.pom
2024-05-18T07:47:39.7110997Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/30/maven-plugins-30.pom (10 kB at 509 kB/s)
2024-05-18T07:47:39.7144160Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom
2024-05-18T07:47:39.7403585Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/30/maven-parent-30.pom (41 kB at 1.7 MB/s)
2024-05-18T07:47:39.7461454Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom
2024-05-18T07:47:39.7636721Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/18/apache-18.pom (16 kB at 870 kB/s)
2024-05-18T07:47:39.7747059Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.jar
2024-05-18T07:47:39.7936153Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.0.2/maven-resources-plugin-3.0.2.jar (32 kB at 1.7 MB/s)
2024-05-18T07:47:39.8051344Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.0/maven-compiler-plugin-3.8.0.pom
2024-05-18T07:47:39.8218754Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.0/maven-compiler-plugin-3.8.0.pom (12 kB at 731 kB/s)
2024-05-18T07:47:39.8247699Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/32/maven-plugins-32.pom
2024-05-18T07:47:39.8414214Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/32/maven-plugins-32.pom (11 kB at 629 kB/s)
2024-05-18T07:47:39.8437453Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/32/maven-parent-32.pom
2024-05-18T07:47:39.8624705Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/32/maven-parent-32.pom (43 kB at 2.3 MB/s)
2024-05-18T07:47:39.8657422Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/20/apache-20.pom
2024-05-18T07:47:39.8817410Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/20/apache-20.pom (16 kB at 991 kB/s)
2024-05-18T07:47:39.8888744Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.0/maven-compiler-plugin-3.8.0.jar
2024-05-18T07:47:39.9097816Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.8.0/maven-compiler-plugin-3.8.0.jar (62 kB at 2.9 MB/s)
2024-05-18T07:47:39.9171367Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.1/maven-surefire-plugin-2.22.1.pom
2024-05-18T07:47:39.9322556Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.1/maven-surefire-plugin-2.22.1.pom (5.0 kB at 333 kB/s)
2024-05-18T07:47:39.9342162Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.1/surefire-2.22.1.pom
2024-05-18T07:47:39.9498268Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.22.1/surefire-2.22.1.pom (26 kB at 1.6 MB/s)
2024-05-18T07:47:39.9520619Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
2024-05-18T07:47:39.9689985Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 2.6 MB/s)
2024-05-18T07:47:39.9720944Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
2024-05-18T07:47:39.9872283Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 1.1 MB/s)
2024-05-18T07:47:39.9933155Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.1/maven-surefire-plugin-2.22.1.jar
2024-05-18T07:47:40.0100956Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.22.1/maven-surefire-plugin-2.22.1.jar (41 kB at 2.5 MB/s)
2024-05-18T07:47:40.0153069Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.0.2/maven-jar-plugin-3.0.2.pom
2024-05-18T07:47:40.0304277Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.0.2/maven-jar-plugin-3.0.2.pom (6.2 kB at 412 kB/s)
2024-05-18T07:47:40.0349069Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.0.2/maven-jar-plugin-3.0.2.jar
2024-05-18T07:47:40.0516657Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.0.2/maven-jar-plugin-3.0.2.jar (27 kB at 1.6 MB/s)
2024-05-18T07:47:40.0544587Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.3.1/maven-checkstyle-plugin-3.3.1.pom
2024-05-18T07:47:40.0697423Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.3.1/maven-checkstyle-plugin-3.3.1.pom (15 kB at 1.0 MB/s)
2024-05-18T07:47:40.0729197Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/maven-plugins-40.pom
2024-05-18T07:47:40.0876844Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/maven-plugins-40.pom (8.1 kB at 539 kB/s)
2024-05-18T07:47:40.0900717Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-parent-40.pom
2024-05-18T07:47:40.1078774Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-parent-40.pom (49 kB at 2.7 MB/s)
2024-05-18T07:47:40.1108065Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom
2024-05-18T07:47:40.1259506Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom (23 kB at 1.5 MB/s)
2024-05-18T07:47:40.1314716Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.3.1/maven-checkstyle-plugin-3.3.1.jar
2024-05-18T07:47:40.1546295Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-checkstyle-plugin/3.3.1/maven-checkstyle-plugin-3.3.1.jar (99 kB at 4.3 MB/s)
2024-05-18T07:47:40.1593280Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.pom
2024-05-18T07:47:40.1749472Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.pom (6.4 kB at 401 kB/s)
2024-05-18T07:47:40.1769784Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/25/maven-plugins-25.pom
2024-05-18T07:47:40.1918348Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/25/maven-plugins-25.pom (9.6 kB at 637 kB/s)
2024-05-18T07:47:40.1942102Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/24/maven-parent-24.pom
2024-05-18T07:47:40.2101109Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/24/maven-parent-24.pom (37 kB at 2.3 MB/s)
2024-05-18T07:47:40.2128501Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/14/apache-14.pom
2024-05-18T07:47:40.2285154Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/14/apache-14.pom (15 kB at 918 kB/s)
2024-05-18T07:47:40.2325001Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.jar
2024-05-18T07:47:40.2481627Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-install-plugin/2.5.2/maven-install-plugin-2.5.2.jar (33 kB at 2.2 MB/s)
2024-05-18T07:47:40.2589574Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom
2024-05-18T07:47:40.2749669Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom (24 kB at 1.5 MB/s)
2024-05-18T07:47:40.2801836Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom
2024-05-18T07:47:40.2957913Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.pom (766 B at 48 kB/s)
2024-05-18T07:47:40.2979325Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom
2024-05-18T07:47:40.3122196Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-parent/1.3/hamcrest-parent-1.3.pom (2.0 kB at 141 kB/s)
2024-05-18T07:47:40.3229922Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar
2024-05-18T07:47:40.3232213Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
2024-05-18T07:47:40.3638373Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar (315 kB at 7.7 MB/s)
2024-05-18T07:47:40.3647375Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar (45 kB at 1.1 MB/s)
2024-05-18T07:47:40.3687206Z [INFO] 
2024-05-18T07:47:40.3688816Z [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ roman-number ---
2024-05-18T07:47:40.3756149Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
2024-05-18T07:47:40.3903529Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 163 kB/s)
2024-05-18T07:47:40.3921946Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom
2024-05-18T07:47:40.4086806Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 kB at 1.3 MB/s)
2024-05-18T07:47:40.4110401Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom
2024-05-18T07:47:40.4271728Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 kB at 1.5 MB/s)
2024-05-18T07:47:40.4294331Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom
2024-05-18T07:47:40.4446653Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 kB at 853 kB/s)
2024-05-18T07:47:40.4488702Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
2024-05-18T07:47:40.4632561Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 278 kB/s)
2024-05-18T07:47:40.4679736Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom
2024-05-18T07:47:40.4830941Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.pom (3.3 kB at 222 kB/s)
2024-05-18T07:47:40.4849376Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
2024-05-18T07:47:40.5006110Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 1.0 MB/s)
2024-05-18T07:47:40.5037923Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom
2024-05-18T07:47:40.5185771Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom (1.9 kB at 129 kB/s)
2024-05-18T07:47:40.5240758Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
2024-05-18T07:47:40.5394683Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 336 kB/s)
2024-05-18T07:47:40.5418770Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
2024-05-18T07:47:40.5570278Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 209 kB/s)
2024-05-18T07:47:40.5585541Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
2024-05-18T07:47:40.5728143Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 186 kB/s)
2024-05-18T07:47:40.5742224Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
2024-05-18T07:47:40.5879114Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 89 kB/s)
2024-05-18T07:47:40.5892634Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
2024-05-18T07:47:40.6027896Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 556 kB/s)
2024-05-18T07:47:40.6044562Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
2024-05-18T07:47:40.6182777Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 827 kB/s)
2024-05-18T07:47:40.6221506Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.6/plexus-component-annotations-1.6.pom
2024-05-18T07:47:40.6360134Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.6/plexus-component-annotations-1.6.pom (748 B at 53 kB/s)
2024-05-18T07:47:40.6377450Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.6/plexus-containers-1.6.pom
2024-05-18T07:47:40.6518692Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.6/plexus-containers-1.6.pom (3.8 kB at 269 kB/s)
2024-05-18T07:47:40.6534675Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.2/plexus-3.3.2.pom
2024-05-18T07:47:40.6687251Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.2/plexus-3.3.2.pom (22 kB at 1.4 MB/s)
2024-05-18T07:47:40.6711382Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom
2024-05-18T07:47:40.6850092Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (6.8 kB at 483 kB/s)
2024-05-18T07:47:40.6867692Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom
2024-05-18T07:47:40.7046428Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 kB at 753 kB/s)
2024-05-18T07:47:40.7085705Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
2024-05-18T07:47:40.7232020Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 286 kB/s)
2024-05-18T07:47:40.7261430Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom
2024-05-18T07:47:40.7420916Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.5/plexus-utils-2.0.5.pom (3.3 kB at 208 kB/s)
2024-05-18T07:47:40.7445192Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
2024-05-18T07:47:40.7584395Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 390 kB/s)
2024-05-18T07:47:40.7620236Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
2024-05-18T07:47:40.7760772Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 790 kB/s)
2024-05-18T07:47:40.7794487Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom
2024-05-18T07:47:40.7932847Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom (6.6 kB at 510 kB/s)
2024-05-18T07:47:40.7978371Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom
2024-05-18T07:47:40.8113550Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.pom (1.9 kB at 134 kB/s)
2024-05-18T07:47:40.8144557Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom
2024-05-18T07:47:40.8284608Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom (2.2 kB at 159 kB/s)
2024-05-18T07:47:40.8324822Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom
2024-05-18T07:47:40.8464057Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 65 kB/s)
2024-05-18T07:47:40.8478049Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom
2024-05-18T07:47:40.8615731Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (5.4 kB at 382 kB/s)
2024-05-18T07:47:40.8633478Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom
2024-05-18T07:47:40.8781854Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 kB at 1.2 MB/s)
2024-05-18T07:47:40.8817943Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom
2024-05-18T07:47:40.8964314Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3.0 kB at 197 kB/s)
2024-05-18T07:47:40.8981382Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom
2024-05-18T07:47:40.9130038Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (6.8 kB at 453 kB/s)
2024-05-18T07:47:40.9147531Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom
2024-05-18T07:47:40.9297120Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (8.4 kB at 560 kB/s)
2024-05-18T07:47:40.9327859Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom
2024-05-18T07:47:40.9481243Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.5/plexus-utils-1.5.5.pom (5.1 kB at 343 kB/s)
2024-05-18T07:47:40.9499577Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom
2024-05-18T07:47:40.9671712Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.11/plexus-1.0.11.pom (9.0 kB at 528 kB/s)
2024-05-18T07:47:40.9700649Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom
2024-05-18T07:47:40.9835211Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (2.1 kB at 148 kB/s)
2024-05-18T07:47:40.9863340Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom
2024-05-18T07:47:40.9999743Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom (1.9 kB at 148 kB/s)
2024-05-18T07:47:41.0033615Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom
2024-05-18T07:47:41.0170440Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (2.2 kB at 173 kB/s)
2024-05-18T07:47:41.0219868Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom
2024-05-18T07:47:41.0352101Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom (2.5 kB at 190 kB/s)
2024-05-18T07:47:41.0396112Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom
2024-05-18T07:47:41.0542803Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom (1.7 kB at 120 kB/s)
2024-05-18T07:47:41.0561735Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom
2024-05-18T07:47:41.0708425Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom (7.7 kB at 515 kB/s)
2024-05-18T07:47:41.0738712Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom
2024-05-18T07:47:41.0885114Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom (2.1 kB at 137 kB/s)
2024-05-18T07:47:41.0915029Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom
2024-05-18T07:47:41.1060858Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom (3.7 kB at 264 kB/s)
2024-05-18T07:47:41.1090470Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom
2024-05-18T07:47:41.1233820Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom (1.7 kB at 116 kB/s)
2024-05-18T07:47:41.1275175Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.pom
2024-05-18T07:47:41.1413717Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.pom (4.1 kB at 295 kB/s)
2024-05-18T07:47:41.1431452Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom
2024-05-18T07:47:41.1584592Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/4.0/plexus-4.0.pom (22 kB at 1.3 MB/s)
2024-05-18T07:47:41.1620132Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.1.1/maven-filtering-3.1.1.pom
2024-05-18T07:47:41.1764210Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.1.1/maven-filtering-3.1.1.pom (5.7 kB at 379 kB/s)
2024-05-18T07:47:41.1783574Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom
2024-05-18T07:47:41.1924748Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/30/maven-shared-components-30.pom (4.6 kB at 327 kB/s)
2024-05-18T07:47:41.1960891Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.0/maven-shared-utils-3.0.0.pom
2024-05-18T07:47:41.2100442Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.0/maven-shared-utils-3.0.0.pom (5.6 kB at 399 kB/s)
2024-05-18T07:47:41.2118339Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/21/maven-shared-components-21.pom
2024-05-18T07:47:41.2255180Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/21/maven-shared-components-21.pom (5.1 kB at 365 kB/s)
2024-05-18T07:47:41.2270976Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/25/maven-parent-25.pom
2024-05-18T07:47:41.2425329Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/25/maven-parent-25.pom (37 kB at 2.3 MB/s)
2024-05-18T07:47:41.2449050Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/15/apache-15.pom
2024-05-18T07:47:41.2586790Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/15/apache-15.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:41.2621339Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.4/commons-io-2.4.pom
2024-05-18T07:47:41.2764526Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.4/commons-io-2.4.pom (10 kB at 678 kB/s)
2024-05-18T07:47:41.2783602Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/25/commons-parent-25.pom
2024-05-18T07:47:41.2977620Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/25/commons-parent-25.pom (48 kB at 2.5 MB/s)
2024-05-18T07:47:41.3023540Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom
2024-05-18T07:47:41.3173212Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/9/apache-9.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:41.3263304Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom
2024-05-18T07:47:41.3402080Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.pom (965 B at 69 kB/s)
2024-05-18T07:47:41.3424619Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.22/plexus-interpolation-1.22.pom
2024-05-18T07:47:41.3559913Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.22/plexus-interpolation-1.22.pom (1.5 kB at 118 kB/s)
2024-05-18T07:47:41.3575759Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom
2024-05-18T07:47:41.3712105Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom (3.1 kB at 236 kB/s)
2024-05-18T07:47:41.3728434Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom
2024-05-18T07:47:41.3875536Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom (20 kB at 1.4 MB/s)
2024-05-18T07:47:41.3911798Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
2024-05-18T07:47:41.4064261Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 200 kB/s)
2024-05-18T07:47:41.4081263Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
2024-05-18T07:47:41.4225391Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 557 kB/s)
2024-05-18T07:47:41.4239244Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
2024-05-18T07:47:41.4374054Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (8.4 kB at 597 kB/s)
2024-05-18T07:47:41.4395347Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.8/plexus-utils-1.5.8.pom
2024-05-18T07:47:41.4528013Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.8/plexus-utils-1.5.8.pom (8.1 kB at 620 kB/s)
2024-05-18T07:47:41.4543367Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom
2024-05-18T07:47:41.4680840Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.2/plexus-2.0.2.pom (12 kB at 893 kB/s)
2024-05-18T07:47:41.4703236Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom
2024-05-18T07:47:41.4855399Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.pom (13 kB at 886 kB/s)
2024-05-18T07:47:41.4872935Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom
2024-05-18T07:47:41.5045690Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/39/commons-parent-39.pom (62 kB at 3.6 MB/s)
2024-05-18T07:47:41.5086449Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom
2024-05-18T07:47:41.5235056Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/16/apache-16.pom (15 kB at 1.0 MB/s)
2024-05-18T07:47:41.5267009Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.24/plexus-interpolation-1.24.pom
2024-05-18T07:47:41.5396924Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.24/plexus-interpolation-1.24.pom (2.6 kB at 202 kB/s)
2024-05-18T07:47:41.5472230Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
2024-05-18T07:47:41.5475043Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
2024-05-18T07:47:41.5478178Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
2024-05-18T07:47:41.5481825Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
2024-05-18T07:47:41.5489327Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
2024-05-18T07:47:41.5628643Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (52 kB at 3.2 MB/s)
2024-05-18T07:47:41.5631454Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
2024-05-18T07:47:41.5650451Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (49 kB at 2.7 MB/s)
2024-05-18T07:47:41.5652306Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar
2024-05-18T07:47:41.5873242Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar (47 kB at 1.2 MB/s)
2024-05-18T07:47:41.5876604Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
2024-05-18T07:47:41.5926087Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (202 kB at 4.4 MB/s)
2024-05-18T07:47:41.5934200Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
2024-05-18T07:47:41.5954940Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (153 kB at 3.2 MB/s)
2024-05-18T07:47:41.5962370Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
2024-05-18T07:47:41.6006002Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (527 kB at 10 MB/s)
2024-05-18T07:47:41.6008991Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
2024-05-18T07:47:41.6027047Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (38 kB at 700 kB/s)
2024-05-18T07:47:41.6029867Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
2024-05-18T07:47:41.6064253Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (472 kB at 8.1 MB/s)
2024-05-18T07:47:41.6066840Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
2024-05-18T07:47:41.6079608Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (30 kB at 510 kB/s)
2024-05-18T07:47:41.6085838Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
2024-05-18T07:47:41.6161434Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (148 kB at 2.2 MB/s)
2024-05-18T07:47:41.6164297Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
2024-05-18T07:47:41.6170809Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (51 kB at 753 kB/s)
2024-05-18T07:47:41.6173646Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
2024-05-18T07:47:41.6194730Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (14 kB at 191 kB/s)
2024-05-18T07:47:41.6197460Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.6/plexus-component-annotations-1.6.jar
2024-05-18T07:47:41.6235272Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (106 kB at 1.4 MB/s)
2024-05-18T07:47:41.6237459Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
2024-05-18T07:47:41.6257278Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (74 kB at 976 kB/s)
2024-05-18T07:47:41.6259926Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
2024-05-18T07:47:41.6320665Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (46 kB at 555 kB/s)
2024-05-18T07:47:41.6323410Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
2024-05-18T07:47:41.6330096Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.6/plexus-component-annotations-1.6.jar (4.3 kB at 51 kB/s)
2024-05-18T07:47:41.6332809Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.jar
2024-05-18T07:47:41.6364199Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar (108 kB at 1.2 MB/s)
2024-05-18T07:47:41.6366972Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.1.1/maven-filtering-3.1.1.jar
2024-05-18T07:47:41.6373982Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (29 kB at 321 kB/s)
2024-05-18T07:47:41.6375651Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.0/maven-shared-utils-3.0.0.jar
2024-05-18T07:47:41.6389356Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (13 kB at 150 kB/s)
2024-05-18T07:47:41.6392297Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar
2024-05-18T07:47:41.6518937Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.1.1/maven-filtering-3.1.1.jar (51 kB at 493 kB/s)
2024-05-18T07:47:41.6522070Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
2024-05-18T07:47:41.6530110Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (165 kB at 1.6 MB/s)
2024-05-18T07:47:41.6532612Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar
2024-05-18T07:47:41.6549043Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar (32 kB at 301 kB/s)
2024-05-18T07:47:41.6551711Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.24/plexus-interpolation-1.24.jar
2024-05-18T07:47:41.6567639Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.jar (247 kB at 2.3 MB/s)
2024-05-18T07:47:41.6583010Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.0/maven-shared-utils-3.0.0.jar (155 kB at 1.4 MB/s)
2024-05-18T07:47:41.6656376Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 72 kB/s)
2024-05-18T07:47:41.6698630Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.24/plexus-interpolation-1.24.jar (79 kB at 652 kB/s)
2024-05-18T07:47:41.6777591Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.5/commons-io-2.5.jar (209 kB at 1.6 MB/s)
2024-05-18T07:47:41.7396717Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2024-05-18T07:47:41.7398226Z [INFO] skip non existing resourceDirectory /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/src/main/resources
2024-05-18T07:47:41.7401878Z [INFO] 
2024-05-18T07:47:41.7402804Z [INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ roman-number ---
2024-05-18T07:47:41.7442024Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom
2024-05-18T07:47:41.7573380Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.pom (770 B at 59 kB/s)
2024-05-18T07:47:41.7588184Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom
2024-05-18T07:47:41.7722676Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.7.1/plexus-containers-1.7.1.pom (5.0 kB at 387 kB/s)
2024-05-18T07:47:41.7781318Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom
2024-05-18T07:47:41.7916789Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.pom (5.6 kB at 402 kB/s)
2024-05-18T07:47:41.7948802Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom
2024-05-18T07:47:41.8079771Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (4.7 kB at 365 kB/s)
2024-05-18T07:47:41.8094177Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom
2024-05-18T07:47:41.8227769Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (6.4 kB at 489 kB/s)
2024-05-18T07:47:41.8241176Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom
2024-05-18T07:47:41.8392654Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (33 kB at 2.2 MB/s)
2024-05-18T07:47:41.8414091Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
2024-05-18T07:47:41.8568006Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 932 kB/s)
2024-05-18T07:47:41.8600152Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom
2024-05-18T07:47:41.8735345Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.pom (1.5 kB at 104 kB/s)
2024-05-18T07:47:41.8752273Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom
2024-05-18T07:47:41.8890385Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/2.2.1/maven-2.2.1.pom (22 kB at 1.6 MB/s)
2024-05-18T07:47:41.8906390Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom
2024-05-18T07:47:41.9048868Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/11/maven-parent-11.pom (32 kB at 2.3 MB/s)
2024-05-18T07:47:41.9069865Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom
2024-05-18T07:47:41.9201992Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/5/apache-5.pom (4.1 kB at 315 kB/s)
2024-05-18T07:47:41.9225727Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom
2024-05-18T07:47:41.9358620Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.pom (12 kB at 895 kB/s)
2024-05-18T07:47:41.9392635Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom
2024-05-18T07:47:41.9526100Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.pom (2.2 kB at 156 kB/s)
2024-05-18T07:47:41.9557078Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom
2024-05-18T07:47:41.9688082Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.pom (3.2 kB at 249 kB/s)
2024-05-18T07:47:41.9711113Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom
2024-05-18T07:47:41.9843293Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.pom (6.8 kB at 527 kB/s)
2024-05-18T07:47:41.9864090Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom
2024-05-18T07:47:41.9993832Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.pom (889 B at 68 kB/s)
2024-05-18T07:47:42.0007106Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom
2024-05-18T07:47:42.0138163Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.14/plexus-components-1.1.14.pom (5.8 kB at 449 kB/s)
2024-05-18T07:47:42.0166750Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom
2024-05-18T07:47:42.0303391Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.pom (2.0 kB at 140 kB/s)
2024-05-18T07:47:42.0336806Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom
2024-05-18T07:47:42.0475136Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.pom (1.9 kB at 136 kB/s)
2024-05-18T07:47:42.0488986Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom
2024-05-18T07:47:42.0619081Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.5.6/slf4j-parent-1.5.6.pom (7.9 kB at 609 kB/s)
2024-05-18T07:47:42.0649108Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom
2024-05-18T07:47:42.0781839Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.pom (3.0 kB at 230 kB/s)
2024-05-18T07:47:42.0806963Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom
2024-05-18T07:47:42.0940677Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.pom (2.2 kB at 167 kB/s)
2024-05-18T07:47:42.0966811Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom
2024-05-18T07:47:42.1100956Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.pom (2.2 kB at 167 kB/s)
2024-05-18T07:47:42.1138213Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom
2024-05-18T07:47:42.1272991Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.pom (1.6 kB at 122 kB/s)
2024-05-18T07:47:42.1300535Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom
2024-05-18T07:47:42.1432601Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.pom (1.9 kB at 144 kB/s)
2024-05-18T07:47:42.1460757Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom
2024-05-18T07:47:42.1592708Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.pom (1.7 kB at 131 kB/s)
2024-05-18T07:47:42.1622347Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom
2024-05-18T07:47:42.1758591Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.pom (2.8 kB at 198 kB/s)
2024-05-18T07:47:42.1787377Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom
2024-05-18T07:47:42.1956816Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.pom (3.1 kB at 183 kB/s)
2024-05-18T07:47:42.1985359Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom
2024-05-18T07:47:42.2119118Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.pom (880 B at 68 kB/s)
2024-05-18T07:47:42.2136818Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom
2024-05-18T07:47:42.2270632Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.pom (1.9 kB at 148 kB/s)
2024-05-18T07:47:42.2305957Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom
2024-05-18T07:47:42.2439366Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.pom (2.1 kB at 159 kB/s)
2024-05-18T07:47:42.2470054Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom
2024-05-18T07:47:42.2600130Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.pom (1.3 kB at 97 kB/s)
2024-05-18T07:47:42.2629188Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom
2024-05-18T07:47:42.2763381Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.1/maven-shared-utils-0.1.pom (4.0 kB at 289 kB/s)
2024-05-18T07:47:42.2776948Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom
2024-05-18T07:47:42.2907953Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/18/maven-shared-components-18.pom (4.9 kB at 380 kB/s)
2024-05-18T07:47:42.2924500Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom
2024-05-18T07:47:42.3061340Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/22/maven-parent-22.pom (30 kB at 2.3 MB/s)
2024-05-18T07:47:42.3079802Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom
2024-05-18T07:47:42.3207540Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/11/apache-11.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:42.3236994Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom
2024-05-18T07:47:42.3366960Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.pom (5.1 kB at 393 kB/s)
2024-05-18T07:47:42.3381344Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom
2024-05-18T07:47:42.3511427Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/0.9.10/plexus-languages-0.9.10.pom (4.1 kB at 318 kB/s)
2024-05-18T07:47:42.3533969Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom
2024-05-18T07:47:42.3669903Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.pom (2.9 kB at 226 kB/s)
2024-05-18T07:47:42.3683055Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom
2024-05-18T07:47:42.3814252Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5/ow2-1.5.pom (11 kB at 864 kB/s)
2024-05-18T07:47:42.3835025Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom
2024-05-18T07:47:42.3970609Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.pom (16 kB at 1.2 MB/s)
2024-05-18T07:47:42.3990155Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom
2024-05-18T07:47:42.4123343Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6 kB at 505 kB/s)
2024-05-18T07:47:42.4229120Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom
2024-05-18T07:47:42.4362047Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.pom (867 B at 67 kB/s)
2024-05-18T07:47:42.4373446Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom
2024-05-18T07:47:42.4506709Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.8.4/plexus-compiler-2.8.4.pom (6.0 kB at 464 kB/s)
2024-05-18T07:47:42.4522379Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom
2024-05-18T07:47:42.4655854Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/4.0/plexus-components-4.0.pom (2.7 kB at 204 kB/s)
2024-05-18T07:47:42.4688377Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom
2024-05-18T07:47:42.4819673Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom (3.8 kB at 295 kB/s)
2024-05-18T07:47:42.4847363Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom
2024-05-18T07:47:42.4977197Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.pom (692 B at 53 kB/s)
2024-05-18T07:47:42.5008207Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom
2024-05-18T07:47:42.5142917Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.pom (771 B at 59 kB/s)
2024-05-18T07:47:42.5156866Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom
2024-05-18T07:47:42.5300062Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.8.4/plexus-compilers-2.8.4.pom (1.3 kB at 96 kB/s)
2024-05-18T07:47:42.5392125Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar
2024-05-18T07:47:42.5394909Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar
2024-05-18T07:47:42.5399725Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar
2024-05-18T07:47:42.5402922Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar
2024-05-18T07:47:42.5417642Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
2024-05-18T07:47:42.5534067Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.7.1/plexus-component-annotations-1.7.1.jar (4.3 kB at 286 kB/s)
2024-05-18T07:47:42.5537239Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar
2024-05-18T07:47:42.5544054Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 903 kB/s)
2024-05-18T07:47:42.5547262Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar
2024-05-18T07:47:42.5555315Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.jar (61 kB at 3.6 MB/s)
2024-05-18T07:47:42.5558976Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar
2024-05-18T07:47:42.5583734Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.2.1/maven-shared-utils-3.2.1.jar (167 kB at 8.8 MB/s)
2024-05-18T07:47:42.5587712Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar
2024-05-18T07:47:42.5639288Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/2.0.4/plexus-utils-2.0.4.jar (222 kB at 8.9 MB/s)
2024-05-18T07:47:42.5642680Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar
2024-05-18T07:47:42.5727982Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/6.2/asm-6.2.jar (111 kB at 3.5 MB/s)
2024-05-18T07:47:42.5730554Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar
2024-05-18T07:47:42.5733471Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.8.4/plexus-compiler-api-2.8.4.jar (27 kB at 846 kB/s)
2024-05-18T07:47:42.5736521Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/0.9.10/plexus-java-0.9.10.jar (39 kB at 1.2 MB/s)
2024-05-18T07:47:42.5773587Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M9/qdox-2.0-M9.jar (317 kB at 8.6 MB/s)
2024-05-18T07:47:42.5789069Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.8.4/plexus-compiler-manager-2.8.4.jar (4.7 kB at 124 kB/s)
2024-05-18T07:47:42.5860563Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.8.4/plexus-compiler-javac-2.8.4.jar (21 kB at 473 kB/s)
2024-05-18T07:47:42.6373313Z [INFO] Changes detected - recompiling the module!
2024-05-18T07:47:42.6387219Z [INFO] Compiling 2 source files to /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/target/classes
2024-05-18T07:47:42.9464886Z [INFO] 
2024-05-18T07:47:42.9466623Z [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ roman-number ---
2024-05-18T07:47:42.9486510Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2024-05-18T07:47:42.9488100Z [INFO] skip non existing resourceDirectory /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/src/test/resources
2024-05-18T07:47:42.9489495Z [INFO] 
2024-05-18T07:47:42.9492413Z [INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ roman-number ---
2024-05-18T07:47:42.9546052Z [INFO] Changes detected - recompiling the module!
2024-05-18T07:47:42.9553731Z [INFO] Compiling 2 source files to /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/target/test-classes
2024-05-18T07:47:43.0039352Z [INFO] 
2024-05-18T07:47:43.0042546Z [INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ roman-number ---
2024-05-18T07:47:43.0089794Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.1/maven-surefire-common-2.22.1.pom
2024-05-18T07:47:43.0234150Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.1/maven-surefire-common-2.22.1.pom (11 kB at 764 kB/s)
2024-05-18T07:47:43.0277822Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom
2024-05-18T07:47:43.0418995Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.pom (1.6 kB at 116 kB/s)
2024-05-18T07:47:43.0440782Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom
2024-05-18T07:47:43.0588309Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.5.2/maven-plugin-tools-3.5.2.pom (15 kB at 1.0 MB/s)
2024-05-18T07:47:43.0613128Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom
2024-05-18T07:47:43.0764933Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/31/maven-parent-31.pom (43 kB at 2.7 MB/s)
2024-05-18T07:47:43.0790641Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom
2024-05-18T07:47:43.0937259Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/19/apache-19.pom (15 kB at 1.0 MB/s)
2024-05-18T07:47:43.0961169Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.1/surefire-api-2.22.1.pom
2024-05-18T07:47:43.1093304Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.1/surefire-api-2.22.1.pom (3.5 kB at 272 kB/s)
2024-05-18T07:47:43.1119551Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.1/surefire-logger-api-2.22.1.pom
2024-05-18T07:47:43.1254823Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.1/surefire-logger-api-2.22.1.pom (2.0 kB at 140 kB/s)
2024-05-18T07:47:43.1283952Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.1/surefire-booter-2.22.1.pom
2024-05-18T07:47:43.1419318Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.1/surefire-booter-2.22.1.pom (7.5 kB at 573 kB/s)
2024-05-18T07:47:43.1464878Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom
2024-05-18T07:47:43.1609244Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom (3.9 kB at 282 kB/s)
2024-05-18T07:47:43.1631635Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom
2024-05-18T07:47:43.1769493Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom (492 B at 35 kB/s)
2024-05-18T07:47:43.1786770Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom
2024-05-18T07:47:43.1915638Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom (5.7 kB at 441 kB/s)
2024-05-18T07:47:43.1947748Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom
2024-05-18T07:47:43.2123097Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.0.4/plexus-utils-1.0.4.pom (6.9 kB at 403 kB/s)
2024-05-18T07:47:43.2141020Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom
2024-05-18T07:47:43.2272613Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.pom (3.1 kB at 241 kB/s)
2024-05-18T07:47:43.2309192Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom
2024-05-18T07:47:43.2444980Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.pom (2.4 kB at 183 kB/s)
2024-05-18T07:47:43.2452957Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom
2024-05-18T07:47:43.2580892Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/15/maven-shared-components-15.pom (9.3 kB at 778 kB/s)
2024-05-18T07:47:43.2592978Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom
2024-05-18T07:47:43.2723133Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/16/maven-parent-16.pom (23 kB at 1.8 MB/s)
2024-05-18T07:47:43.2736950Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom
2024-05-18T07:47:43.2872192Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (14 kB at 1.1 MB/s)
2024-05-18T07:47:43.2912008Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom
2024-05-18T07:47:43.3040494Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.pom (3.3 kB at 256 kB/s)
2024-05-18T07:47:43.3062808Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom
2024-05-18T07:47:43.3198168Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.pom (3.3 kB at 257 kB/s)
2024-05-18T07:47:43.3231164Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom
2024-05-18T07:47:43.3358729Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.pom (16 kB at 1.2 MB/s)
2024-05-18T07:47:43.3439572Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.1/maven-surefire-common-2.22.1.jar
2024-05-18T07:47:43.3445225Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar
2024-05-18T07:47:43.3449707Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar
2024-05-18T07:47:43.3460987Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.1/surefire-api-2.22.1.jar
2024-05-18T07:47:43.3464118Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.1/surefire-logger-api-2.22.1.jar
2024-05-18T07:47:43.3589538Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar (12 kB at 825 kB/s)
2024-05-18T07:47:43.3592615Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.1/surefire-booter-2.22.1.jar
2024-05-18T07:47:43.3598202Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.5.2/maven-plugin-annotations-3.5.2.jar (14 kB at 951 kB/s)
2024-05-18T07:47:43.3601082Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar
2024-05-18T07:47:43.3603870Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/2.22.1/surefire-logger-api-2.22.1.jar (13 kB at 890 kB/s)
2024-05-18T07:47:43.3605687Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar
2024-05-18T07:47:43.3689731Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/2.22.1/surefire-api-2.22.1.jar (186 kB at 7.4 MB/s)
2024-05-18T07:47:43.3691798Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar
2024-05-18T07:47:43.3717001Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/2.22.1/maven-surefire-common-2.22.1.jar (528 kB at 20 MB/s)
2024-05-18T07:47:43.3721142Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar
2024-05-18T07:47:43.3736462Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar (80 kB at 2.8 MB/s)
2024-05-18T07:47:43.3738850Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar
2024-05-18T07:47:43.3770781Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/1.5.15/plexus-utils-1.5.15.jar (228 kB at 7.1 MB/s)
2024-05-18T07:47:43.3773610Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar
2024-05-18T07:47:43.3779642Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/2.22.1/surefire-booter-2.22.1.jar (274 kB at 8.3 MB/s)
2024-05-18T07:47:43.3781725Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar
2024-05-18T07:47:43.3833455Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar (39 kB at 1.0 MB/s)
2024-05-18T07:47:43.3836454Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar
2024-05-18T07:47:43.3886131Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.jar (194 kB at 4.4 MB/s)
2024-05-18T07:47:43.3888139Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar
2024-05-18T07:47:43.3904497Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar (156 kB at 3.4 MB/s)
2024-05-18T07:47:43.3906307Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar
2024-05-18T07:47:43.3912922Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar (49 kB at 1.1 MB/s)
2024-05-18T07:47:43.3915043Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar
2024-05-18T07:47:43.3991172Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar (68 kB at 1.3 MB/s)
2024-05-18T07:47:43.3994117Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar
2024-05-18T07:47:43.3997009Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar (35 kB at 655 kB/s)
2024-05-18T07:47:43.3999678Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar
2024-05-18T07:47:43.4036008Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar (30 kB at 504 kB/s)
2024-05-18T07:47:43.4038646Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar
2024-05-18T07:47:43.4058249Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.11/plexus-interpolation-1.11.jar (51 kB at 849 kB/s)
2024-05-18T07:47:43.4060761Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar
2024-05-18T07:47:43.4090106Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/backport-util-concurrent/backport-util-concurrent/3.1/backport-util-concurrent-3.1.jar (332 kB at 5.2 MB/s)
2024-05-18T07:47:43.4095345Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar
2024-05-18T07:47:43.4121240Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar (88 kB at 1.3 MB/s)
2024-05-18T07:47:43.4123991Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar
2024-05-18T07:47:43.4152785Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar (178 kB at 2.5 MB/s)
2024-05-18T07:47:43.4156127Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar
2024-05-18T07:47:43.4165490Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar (22 kB at 308 kB/s)
2024-05-18T07:47:43.4167563Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar
2024-05-18T07:47:43.4174557Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-jdk14/1.5.6/slf4j-jdk14-1.5.6.jar (8.8 kB at 121 kB/s)
2024-05-18T07:47:43.4176479Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar
2024-05-18T07:47:43.4221663Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.5.6/slf4j-api-1.5.6.jar (22 kB at 290 kB/s)
2024-05-18T07:47:43.4224310Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar
2024-05-18T07:47:43.4245677Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jcl-over-slf4j/1.5.6/jcl-over-slf4j-1.5.6.jar (17 kB at 209 kB/s)
2024-05-18T07:47:43.4247425Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar
2024-05-18T07:47:43.4307768Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.0/maven-reporting-api-3.0.jar (11 kB at 127 kB/s)
2024-05-18T07:47:43.4309672Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar
2024-05-18T07:47:43.4312059Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar (13 kB at 151 kB/s)
2024-05-18T07:47:43.4313779Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar
2024-05-18T07:47:43.4315317Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar (26 kB at 295 kB/s)
2024-05-18T07:47:43.4374539Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1/classworlds-1.1.jar (38 kB at 407 kB/s)
2024-05-18T07:47:43.4384228Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar (10 kB at 111 kB/s)
2024-05-18T07:47:43.4442516Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar (38 kB at 380 kB/s)
2024-05-18T07:47:43.4504936Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0-M8/qdox-2.0-M8.jar (316 kB at 3.0 MB/s)
2024-05-18T07:47:43.5873373Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.22.1/surefire-junit4-2.22.1.pom
2024-05-18T07:47:43.6007164Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.22.1/surefire-junit4-2.22.1.pom (3.1 kB at 220 kB/s)
2024-05-18T07:47:43.6019394Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.22.1/surefire-providers-2.22.1.pom
2024-05-18T07:47:43.6150743Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.22.1/surefire-providers-2.22.1.pom (2.5 kB at 191 kB/s)
2024-05-18T07:47:43.6404235Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.22.1/surefire-junit4-2.22.1.jar
2024-05-18T07:47:43.6558983Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit4/2.22.1/surefire-junit4-2.22.1.jar (85 kB at 5.6 MB/s)
2024-05-18T07:47:43.6649070Z [INFO] 
2024-05-18T07:47:43.6650192Z [INFO] -------------------------------------------------------
2024-05-18T07:47:43.6650901Z [INFO]  T E S T S
2024-05-18T07:47:43.6651496Z [INFO] -------------------------------------------------------
2024-05-18T07:47:43.8511195Z [INFO] Running it.unipd.mtss.IntegerToRomanTest
2024-05-18T07:47:43.9164912Z [INFO] Tests run: 16, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 s - in it.unipd.mtss.IntegerToRomanTest
2024-05-18T07:47:43.9175615Z [INFO] Running it.unipd.mtss.RomanPrinterTest
2024-05-18T07:47:43.9213221Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in it.unipd.mtss.RomanPrinterTest
2024-05-18T07:47:43.9214519Z [INFO] Running jar.AppTest
2024-05-18T07:47:43.9232296Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in jar.AppTest
2024-05-18T07:47:43.9233445Z [INFO] Running jar.IntegerToRomanTest
2024-05-18T07:47:43.9255522Z [INFO] Tests run: 16, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in jar.IntegerToRomanTest
2024-05-18T07:47:43.9257003Z [INFO] Running jar.RomanPrinterTest
2024-05-18T07:47:43.9273618Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in jar.RomanPrinterTest
2024-05-18T07:47:44.2475461Z [INFO] 
2024-05-18T07:47:44.2476073Z [INFO] Results:
2024-05-18T07:47:44.2476606Z [INFO] 
2024-05-18T07:47:44.2477854Z [INFO] Tests run: 47, Failures: 0, Errors: 0, Skipped: 0
2024-05-18T07:47:44.2478681Z [INFO] 
2024-05-18T07:47:44.2522629Z [INFO] 
2024-05-18T07:47:44.2523955Z [INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ roman-number ---
2024-05-18T07:47:44.2574096Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.1.1/maven-archiver-3.1.1.pom
2024-05-18T07:47:44.2725535Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.1.1/maven-archiver-3.1.1.pom (4.3 kB at 290 kB/s)
2024-05-18T07:47:44.2752256Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.1/maven-shared-utils-3.0.1.pom
2024-05-18T07:47:44.2903739Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.1/maven-shared-utils-3.0.1.pom (4.6 kB at 286 kB/s)
2024-05-18T07:47:44.2930243Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.3/plexus-archiver-3.3.pom
2024-05-18T07:47:44.3083561Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.3/plexus-archiver-3.3.pom (5.3 kB at 355 kB/s)
2024-05-18T07:47:44.3097075Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.2/plexus-3.2.pom
2024-05-18T07:47:44.3230447Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.2/plexus-3.2.pom (19 kB at 1.4 MB/s)
2024-05-18T07:47:44.3265135Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.7.1/plexus-io-2.7.1.pom
2024-05-18T07:47:44.3420310Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.7.1/plexus-io-2.7.1.pom (4.9 kB at 328 kB/s)
2024-05-18T07:47:44.3445708Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.2/commons-io-2.2.pom
2024-05-18T07:47:44.3601424Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.2/commons-io-2.2.pom (11 kB at 736 kB/s)
2024-05-18T07:47:44.3616044Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/24/commons-parent-24.pom
2024-05-18T07:47:44.3764923Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/24/commons-parent-24.pom (47 kB at 3.2 MB/s)
2024-05-18T07:47:44.3799645Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.11/commons-compress-1.11.pom
2024-05-18T07:47:44.3954576Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.11/commons-compress-1.11.pom (13 kB at 785 kB/s)
2024-05-18T07:47:44.3986450Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom
2024-05-18T07:47:44.4122032Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:44.4140724Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.5/xz-1.5.pom
2024-05-18T07:47:44.4268256Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.5/xz-1.5.pom (1.9 kB at 146 kB/s)
2024-05-18T07:47:44.4286434Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.4/plexus-archiver-3.4.pom
2024-05-18T07:47:44.4449855Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.4/plexus-archiver-3.4.pom (5.3 kB at 333 kB/s)
2024-05-18T07:47:44.4523223Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.1.1/maven-archiver-3.1.1.jar
2024-05-18T07:47:44.4526160Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.1/maven-shared-utils-3.0.1.jar
2024-05-18T07:47:44.4528064Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.4/plexus-archiver-3.4.jar
2024-05-18T07:47:44.4531883Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.11/commons-compress-1.11.jar
2024-05-18T07:47:44.4535994Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.7.1/plexus-io-2.7.1.jar
2024-05-18T07:47:44.4684765Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.1.1/maven-archiver-3.1.1.jar (24 kB at 1.4 MB/s)
2024-05-18T07:47:44.4687702Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar
2024-05-18T07:47:44.4693881Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.7.1/plexus-io-2.7.1.jar (86 kB at 5.4 MB/s)
2024-05-18T07:47:44.4696172Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.5/xz-1.5.jar
2024-05-18T07:47:44.4717043Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.0.1/maven-shared-utils-3.0.1.jar (154 kB at 7.7 MB/s)
2024-05-18T07:47:44.4775856Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/3.4/plexus-archiver-3.4.jar (187 kB at 7.2 MB/s)
2024-05-18T07:47:44.4796046Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.11/commons-compress-1.11.jar (426 kB at 16 MB/s)
2024-05-18T07:47:44.4835930Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar (58 kB at 2.0 MB/s)
2024-05-18T07:47:44.4852889Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.5/xz-1.5.jar (100 kB at 3.2 MB/s)
2024-05-18T07:47:44.5949790Z [INFO] Building jar: /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/target/roman-number-1.0-SNAPSHOT.jar
2024-05-18T07:47:44.6359129Z [INFO] 
2024-05-18T07:47:44.6360472Z [INFO] --- maven-checkstyle-plugin:3.3.1:checkstyle (default) @ roman-number ---
2024-05-18T07:47:44.6402343Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.1.1/maven-reporting-api-3.1.1.pom
2024-05-18T07:47:44.6541975Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.1.1/maven-reporting-api-3.1.1.pom (3.8 kB at 269 kB/s)
2024-05-18T07:47:44.6560472Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
2024-05-18T07:47:44.6705188Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 340 kB/s)
2024-05-18T07:47:44.6720419Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom
2024-05-18T07:47:44.6862496Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 3.1 MB/s)
2024-05-18T07:47:44.6882943Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
2024-05-18T07:47:44.7035633Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 1.2 MB/s)
2024-05-18T07:47:44.7063251Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.11.1/doxia-sink-api-1.11.1.pom
2024-05-18T07:47:44.7204331Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.11.1/doxia-sink-api-1.11.1.pom (1.6 kB at 113 kB/s)
2024-05-18T07:47:44.7220169Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.11.1/doxia-1.11.1.pom
2024-05-18T07:47:44.7360240Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.11.1/doxia-1.11.1.pom (18 kB at 1.3 MB/s)
2024-05-18T07:47:44.7390156Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.11.1/doxia-logging-api-1.11.1.pom
2024-05-18T07:47:44.7528229Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.11.1/doxia-logging-api-1.11.1.pom (1.6 kB at 113 kB/s)
2024-05-18T07:47:44.7557237Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.pom
2024-05-18T07:47:44.7695053Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.pom (7.6 kB at 543 kB/s)
2024-05-18T07:47:44.7723688Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.0/maven-core-3.1.0.pom
2024-05-18T07:47:44.7858957Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.0/maven-core-3.1.0.pom (6.9 kB at 533 kB/s)
2024-05-18T07:47:44.7873169Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.1.0/maven-3.1.0.pom
2024-05-18T07:47:44.8014748Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.1.0/maven-3.1.0.pom (22 kB at 1.6 MB/s)
2024-05-18T07:47:44.8051056Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.1.0/maven-model-3.1.0.pom
2024-05-18T07:47:44.8238221Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.1.0/maven-model-3.1.0.pom (3.8 kB at 254 kB/s)
2024-05-18T07:47:44.8241398Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom
2024-05-18T07:47:44.8384495Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom (8.7 kB at 541 kB/s)
2024-05-18T07:47:44.8409221Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom
2024-05-18T07:47:44.8550682Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom (27 kB at 2.0 MB/s)
2024-05-18T07:47:44.8581289Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom
2024-05-18T07:47:44.8733768Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom (5.6 kB at 352 kB/s)
2024-05-18T07:47:44.8752388Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.0/maven-settings-3.1.0.pom
2024-05-18T07:47:44.8890825Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.0/maven-settings-3.1.0.pom (1.8 kB at 131 kB/s)
2024-05-18T07:47:44.8914122Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.0/maven-settings-builder-3.1.0.pom
2024-05-18T07:47:44.9042434Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.0/maven-settings-builder-3.1.0.pom (2.3 kB at 188 kB/s)
2024-05-18T07:47:44.9067690Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.16/plexus-interpolation-1.16.pom
2024-05-18T07:47:44.9197918Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.16/plexus-interpolation-1.16.pom (1.0 kB at 79 kB/s)
2024-05-18T07:47:44.9209624Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3/plexus-components-1.3.pom
2024-05-18T07:47:44.9346096Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3/plexus-components-1.3.pom (3.1 kB at 218 kB/s)
2024-05-18T07:47:44.9358109Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom
2024-05-18T07:47:44.9491244Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom (20 kB at 1.5 MB/s)
2024-05-18T07:47:44.9514204Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom
2024-05-18T07:47:44.9644230Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 63 kB/s)
2024-05-18T07:47:44.9658398Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom
2024-05-18T07:47:44.9788124Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (4.2 kB at 326 kB/s)
2024-05-18T07:47:44.9815433Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.0/maven-repository-metadata-3.1.0.pom
2024-05-18T07:47:44.9950772Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.0/maven-repository-metadata-3.1.0.pom (1.9 kB at 145 kB/s)
2024-05-18T07:47:44.9974740Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.0/maven-artifact-3.1.0.pom
2024-05-18T07:47:45.0099357Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.0/maven-artifact-3.1.0.pom (1.6 kB at 136 kB/s)
2024-05-18T07:47:45.0132788Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.0/maven-plugin-api-3.1.0.pom
2024-05-18T07:47:45.0255260Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.0/maven-plugin-api-3.1.0.pom (3.0 kB at 234 kB/s)
2024-05-18T07:47:45.0278619Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom
2024-05-18T07:47:45.0407520Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom (15 kB at 1.2 MB/s)
2024-05-18T07:47:45.0419368Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom
2024-05-18T07:47:45.0545510Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:45.0570780Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom
2024-05-18T07:47:45.0698815Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom (13 kB at 1.0 MB/s)
2024-05-18T07:47:45.0714742Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom
2024-05-18T07:47:45.0841321Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom (4.8 kB at 399 kB/s)
2024-05-18T07:47:45.0862862Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom
2024-05-18T07:47:45.0991641Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom (6.3 kB at 483 kB/s)
2024-05-18T07:47:45.1005179Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom
2024-05-18T07:47:45.1140740Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom (32 kB at 2.5 MB/s)
2024-05-18T07:47:45.1166364Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom
2024-05-18T07:47:45.1295721Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 47 kB/s)
2024-05-18T07:47:45.1315210Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom
2024-05-18T07:47:45.1443967Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom (17 kB at 1.3 MB/s)
2024-05-18T07:47:45.1458901Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom
2024-05-18T07:47:45.1586122Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom (15 kB at 1.1 MB/s)
2024-05-18T07:47:45.1606964Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom
2024-05-18T07:47:45.1736385Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom (750 B at 58 kB/s)
2024-05-18T07:47:45.1748679Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom
2024-05-18T07:47:45.1875487Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom (4.8 kB at 370 kB/s)
2024-05-18T07:47:45.1887468Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
2024-05-18T07:47:45.2017852Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 1.7 MB/s)
2024-05-18T07:47:45.2039231Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom
2024-05-18T07:47:45.2170289Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom (7.9 kB at 609 kB/s)
2024-05-18T07:47:45.2192219Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.0/maven-model-builder-3.1.0.pom
2024-05-18T07:47:45.2345778Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.0/maven-model-builder-3.1.0.pom (2.5 kB at 154 kB/s)
2024-05-18T07:47:45.2374450Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.1.0/maven-aether-provider-3.1.0.pom
2024-05-18T07:47:45.2499519Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.1.0/maven-aether-provider-3.1.0.pom (3.5 kB at 294 kB/s)
2024-05-18T07:47:45.2530731Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/0.9.0.M2/aether-api-0.9.0.M2.pom
2024-05-18T07:47:45.2660227Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/0.9.0.M2/aether-api-0.9.0.M2.pom (1.7 kB at 134 kB/s)
2024-05-18T07:47:45.2673615Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom
2024-05-18T07:47:45.2806821Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/0.9.0.M2/aether-0.9.0.M2.pom (28 kB at 2.1 MB/s)
2024-05-18T07:47:45.2832179Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/0.9.0.M2/aether-spi-0.9.0.M2.pom
2024-05-18T07:47:45.2967058Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/0.9.0.M2/aether-spi-0.9.0.M2.pom (1.8 kB at 126 kB/s)
2024-05-18T07:47:45.2987960Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom
2024-05-18T07:47:45.3126851Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.pom (2.0 kB at 145 kB/s)
2024-05-18T07:47:45.3149773Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/0.9.0.M2/aether-impl-0.9.0.M2.pom
2024-05-18T07:47:45.3278763Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/0.9.0.M2/aether-impl-0.9.0.M2.pom (3.3 kB at 258 kB/s)
2024-05-18T07:47:45.3302066Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4.2/plexus-classworlds-2.4.2.pom
2024-05-18T07:47:45.3472675Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4.2/plexus-classworlds-2.4.2.pom (3.5 kB at 206 kB/s)
2024-05-18T07:47:45.3484785Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom
2024-05-18T07:47:45.3613586Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.0.1/plexus-3.0.1.pom (19 kB at 1.4 MB/s)
2024-05-18T07:47:45.3638770Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom
2024-05-18T07:47:45.3764836Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom (5.8 kB at 449 kB/s)
2024-05-18T07:47:45.3786574Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom
2024-05-18T07:47:45.3912479Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.pom (14 kB at 1.1 MB/s)
2024-05-18T07:47:45.3925768Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom
2024-05-18T07:47:45.4064922Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/42/commons-parent-42.pom (68 kB at 4.9 MB/s)
2024-05-18T07:47:45.4111520Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/2.1.0/plexus-container-default-2.1.0.pom
2024-05-18T07:47:45.4243802Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/2.1.0/plexus-container-default-2.1.0.pom (3.0 kB at 212 kB/s)
2024-05-18T07:47:45.4277917Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.7/xbean-reflect-3.7.pom
2024-05-18T07:47:45.4398518Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.7/xbean-reflect-3.7.pom (5.1 kB at 392 kB/s)
2024-05-18T07:47:45.4409555Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean/3.7/xbean-3.7.pom
2024-05-18T07:47:45.4569210Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean/3.7/xbean-3.7.pom (15 kB at 965 kB/s)
2024-05-18T07:47:45.4582107Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis-java5-flava/2.0/genesis-java5-flava-2.0.pom
2024-05-18T07:47:45.4708234Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis-java5-flava/2.0/genesis-java5-flava-2.0.pom (5.5 kB at 457 kB/s)
2024-05-18T07:47:45.4719698Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis-default-flava/2.0/genesis-default-flava-2.0.pom
2024-05-18T07:47:45.4864332Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis-default-flava/2.0/genesis-default-flava-2.0.pom (18 kB at 1.2 MB/s)
2024-05-18T07:47:45.4878354Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis/2.0/genesis-2.0.pom
2024-05-18T07:47:45.5006570Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/geronimo/genesis/genesis/2.0/genesis-2.0.pom (18 kB at 1.4 MB/s)
2024-05-18T07:47:45.5030616Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.pom
2024-05-18T07:47:45.5152990Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.pom (2.5 kB at 206 kB/s)
2024-05-18T07:47:45.5164917Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/google/1/google-1.pom
2024-05-18T07:47:45.5288252Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/google/1/google-1.pom (1.6 kB at 130 kB/s)
2024-05-18T07:47:45.5303675Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.11.1/doxia-decoration-model-1.11.1.pom
2024-05-18T07:47:45.5428948Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.11.1/doxia-decoration-model-1.11.1.pom (3.4 kB at 284 kB/s)
2024-05-18T07:47:45.5438739Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.11.1/doxia-sitetools-1.11.1.pom
2024-05-18T07:47:45.5566158Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sitetools/1.11.1/doxia-sitetools-1.11.1.pom (14 kB at 1.0 MB/s)
2024-05-18T07:47:45.5595178Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom
2024-05-18T07:47:45.5725644Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.0.0/plexus-component-annotations-2.0.0.pom (750 B at 58 kB/s)
2024-05-18T07:47:45.5737923Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom
2024-05-18T07:47:45.5863038Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.0.0/plexus-containers-2.0.0.pom (4.8 kB at 400 kB/s)
2024-05-18T07:47:45.5883821Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.11.1/doxia-core-1.11.1.pom
2024-05-18T07:47:45.6009350Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.11.1/doxia-core-1.11.1.pom (4.5 kB at 377 kB/s)
2024-05-18T07:47:45.6030523Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.pom
2024-05-18T07:47:45.6158288Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.8.1/commons-lang3-3.8.1.pom (28 kB at 2.1 MB/s)
2024-05-18T07:47:45.6175572Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom
2024-05-18T07:47:45.6319625Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/47/commons-parent-47.pom (78 kB at 5.5 MB/s)
2024-05-18T07:47:45.6360654Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.3/commons-text-1.3.pom
2024-05-18T07:47:45.6490586Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.3/commons-text-1.3.pom (14 kB at 1.1 MB/s)
2024-05-18T07:47:45.6504448Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/45/commons-parent-45.pom
2024-05-18T07:47:45.6652211Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/45/commons-parent-45.pom (73 kB at 5.2 MB/s)
2024-05-18T07:47:45.6682698Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.pom
2024-05-18T07:47:45.6809718Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.7/commons-lang3-3.7.pom (28 kB at 2.1 MB/s)
2024-05-18T07:47:45.6843043Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.pom
2024-05-18T07:47:45.6970102Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.pom (6.6 kB at 508 kB/s)
2024-05-18T07:47:45.6987809Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.5.13/httpcomponents-client-4.5.13.pom
2024-05-18T07:47:45.7119694Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.5.13/httpcomponents-client-4.5.13.pom (16 kB at 1.3 MB/s)
2024-05-18T07:47:45.7136119Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/11/httpcomponents-parent-11.pom
2024-05-18T07:47:45.7267015Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/11/httpcomponents-parent-11.pom (35 kB at 2.7 MB/s)
2024-05-18T07:47:45.7299462Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.pom
2024-05-18T07:47:45.7427427Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.13/httpcore-4.4.13.pom (5.0 kB at 382 kB/s)
2024-05-18T07:47:45.7444734Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.13/httpcomponents-core-4.4.13.pom
2024-05-18T07:47:45.7573373Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.13/httpcomponents-core-4.4.13.pom (13 kB at 1.1 MB/s)
2024-05-18T07:47:45.7602011Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom
2024-05-18T07:47:45.7732994Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.pom (19 kB at 1.5 MB/s)
2024-05-18T07:47:45.7746929Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom
2024-05-18T07:47:45.7882778Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/34/commons-parent-34.pom (56 kB at 4.3 MB/s)
2024-05-18T07:47:45.7910972Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.pom
2024-05-18T07:47:45.8040854Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.pom (14 kB at 1.1 MB/s)
2024-05-18T07:47:45.8068738Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.14/httpcore-4.4.14.pom
2024-05-18T07:47:45.8193847Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.14/httpcore-4.4.14.pom (5.0 kB at 382 kB/s)
2024-05-18T07:47:45.8209878Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.14/httpcomponents-core-4.4.14.pom
2024-05-18T07:47:45.8335013Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.14/httpcomponents-core-4.4.14.pom (13 kB at 1.0 MB/s)
2024-05-18T07:47:45.8363528Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.11.1/doxia-integration-tools-1.11.1.pom
2024-05-18T07:47:45.8490763Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.11.1/doxia-integration-tools-1.11.1.pom (6.0 kB at 465 kB/s)
2024-05-18T07:47:45.8515709Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom
2024-05-18T07:47:45.8645879Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.0/doxia-sink-api-1.0.pom (1.4 kB at 107 kB/s)
2024-05-18T07:47:45.8658504Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom
2024-05-18T07:47:45.8787006Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia/1.0/doxia-1.0.pom (9.6 kB at 742 kB/s)
2024-05-18T07:47:45.8802815Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom
2024-05-18T07:47:45.8932947Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/10/maven-parent-10.pom (32 kB at 2.6 MB/s)
2024-05-18T07:47:45.8950054Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom
2024-05-18T07:47:45.9091890Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (4.5 kB at 321 kB/s)
2024-05-18T07:47:45.9115451Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom
2024-05-18T07:47:45.9244965Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9/plexus-container-default-1.0-alpha-9.pom (1.2 kB at 103 kB/s)
2024-05-18T07:47:45.9267757Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom
2024-05-18T07:47:45.9388679Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.pom (998 B at 77 kB/s)
2024-05-18T07:47:45.9407781Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.pom
2024-05-18T07:47:45.9535644Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.pom (2.1 kB at 160 kB/s)
2024-05-18T07:47:45.9550162Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.12/plexus-components-1.1.12.pom
2024-05-18T07:47:45.9674159Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.12/plexus-components-1.1.12.pom (3.0 kB at 231 kB/s)
2024-05-18T07:47:45.9685755Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.10/plexus-1.0.10.pom
2024-05-18T07:47:45.9812422Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/1.0.10/plexus-1.0.10.pom (8.2 kB at 688 kB/s)
2024-05-18T07:47:45.9838107Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom
2024-05-18T07:47:45.9968741Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom (2.7 kB at 204 kB/s)
2024-05-18T07:47:45.9988122Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.11.1/doxia-site-renderer-1.11.1.pom
2024-05-18T07:47:46.0117138Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.11.1/doxia-site-renderer-1.11.1.pom (7.7 kB at 592 kB/s)
2024-05-18T07:47:46.0145638Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.11.1/doxia-skin-model-1.11.1.pom
2024-05-18T07:47:46.0277497Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.11.1/doxia-skin-model-1.11.1.pom (3.0 kB at 234 kB/s)
2024-05-18T07:47:46.0301910Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.11.1/doxia-module-xhtml-1.11.1.pom
2024-05-18T07:47:46.0434315Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.11.1/doxia-module-xhtml-1.11.1.pom (2.0 kB at 141 kB/s)
2024-05-18T07:47:46.0445677Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.11.1/doxia-modules-1.11.1.pom
2024-05-18T07:47:46.0568887Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-modules/1.11.1/doxia-modules-1.11.1.pom (2.7 kB at 228 kB/s)
2024-05-18T07:47:46.0587959Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.11.1/doxia-module-xhtml5-1.11.1.pom
2024-05-18T07:47:46.0707639Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.11.1/doxia-module-xhtml5-1.11.1.pom (2.0 kB at 165 kB/s)
2024-05-18T07:47:46.0727059Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.pom
2024-05-18T07:47:46.0852460Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-30/plexus-container-default-1.0-alpha-30.pom (3.5 kB at 290 kB/s)
2024-05-18T07:47:46.0867474Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-30/plexus-containers-1.0-alpha-30.pom
2024-05-18T07:47:46.0987890Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.0-alpha-30/plexus-containers-1.0-alpha-30.pom (1.9 kB at 158 kB/s)
2024-05-18T07:47:46.1005973Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-9/plexus-classworlds-1.2-alpha-9.pom
2024-05-18T07:47:46.1126131Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/1.2-alpha-9/plexus-classworlds-1.2-alpha-9.pom (3.2 kB at 269 kB/s)
2024-05-18T07:47:46.1140207Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.2/plexus-velocity-1.2.pom
2024-05-18T07:47:46.1272465Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.2/plexus-velocity-1.2.pom (2.8 kB at 217 kB/s)
2024-05-18T07:47:46.1292541Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.1/commons-collections-3.1.pom
2024-05-18T07:47:46.1420679Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.1/commons-collections-3.1.pom (6.1 kB at 468 kB/s)
2024-05-18T07:47:46.1434769Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.7/velocity-1.7.pom
2024-05-18T07:47:46.1566143Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.7/velocity-1.7.pom (11 kB at 835 kB/s)
2024-05-18T07:47:46.1585729Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.pom
2024-05-18T07:47:46.1714712Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.pom (13 kB at 962 kB/s)
2024-05-18T07:47:46.1731025Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/9/commons-parent-9.pom
2024-05-18T07:47:46.1860265Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/9/commons-parent-9.pom (22 kB at 1.7 MB/s)
2024-05-18T07:47:46.1879146Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.pom
2024-05-18T07:47:46.2005906Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.pom (14 kB at 1.1 MB/s)
2024-05-18T07:47:46.2025719Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.pom
2024-05-18T07:47:46.2154902Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.pom (18 kB at 1.4 MB/s)
2024-05-18T07:47:46.2178884Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.pom
2024-05-18T07:47:46.2312156Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.7.0/commons-beanutils-1.7.0.pom (357 B at 27 kB/s)
2024-05-18T07:47:46.2326925Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.3/commons-logging-1.0.3.pom
2024-05-18T07:47:46.2455003Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0.3/commons-logging-1.0.3.pom (866 B at 67 kB/s)
2024-05-18T07:47:46.2470354Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.pom
2024-05-18T07:47:46.2595775Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.pom (7.0 kB at 539 kB/s)
2024-05-18T07:47:46.2615030Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1/commons-logging-1.1.pom
2024-05-18T07:47:46.2740322Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.1/commons-logging-1.1.pom (6.2 kB at 515 kB/s)
2024-05-18T07:47:46.2760176Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom
2024-05-18T07:47:46.2887325Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/log4j/log4j/1.2.12/log4j-1.2.12.pom (145 B at 11 kB/s)
2024-05-18T07:47:46.2900502Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/logkit/logkit/1.0.1/logkit-1.0.1.pom
2024-05-18T07:47:46.3029122Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/logkit/logkit/1.0.1/logkit-1.0.1.pom (147 B at 11 kB/s)
2024-05-18T07:47:46.3042453Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/avalon-framework/avalon-framework/4.1.3/avalon-framework-4.1.3.pom
2024-05-18T07:47:46.3169153Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/avalon-framework/avalon-framework/4.1.3/avalon-framework-4.1.3.pom (167 B at 13 kB/s)
2024-05-18T07:47:46.3181520Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.pom
2024-05-18T07:47:46.3310114Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.pom (6.0 kB at 463 kB/s)
2024-05-18T07:47:46.3325845Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.6/commons-digester-1.6.pom
2024-05-18T07:47:46.3452104Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.6/commons-digester-1.6.pom (974 B at 81 kB/s)
2024-05-18T07:47:46.3464709Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.6/commons-beanutils-1.6.pom
2024-05-18T07:47:46.3590737Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.6/commons-beanutils-1.6.pom (2.3 kB at 192 kB/s)
2024-05-18T07:47:46.3603956Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0/commons-logging-1.0.pom
2024-05-18T07:47:46.3727232Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.0/commons-logging-1.0.pom (163 B at 14 kB/s)
2024-05-18T07:47:46.3739801Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.pom
2024-05-18T07:47:46.3863656Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.0/commons-collections-2.0.pom (171 B at 13 kB/s)
2024-05-18T07:47:46.3875311Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.1/commons-collections-2.1.pom
2024-05-18T07:47:46.3997044Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/2.1/commons-collections-2.1.pom (3.3 kB at 278 kB/s)
2024-05-18T07:47:46.4008603Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom
2024-05-18T07:47:46.4129935Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/xml-apis/xml-apis/1.0.b2/xml-apis-1.0.b2.pom (2.2 kB at 187 kB/s)
2024-05-18T07:47:46.4141684Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2/commons-collections-3.2.pom
2024-05-18T07:47:46.4267547Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2/commons-collections-3.2.pom (11 kB at 849 kB/s)
2024-05-18T07:47:46.4285120Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.pom
2024-05-18T07:47:46.4410235Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.pom (142 B at 12 kB/s)
2024-05-18T07:47:46.4422057Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.pom
2024-05-18T07:47:46.4545540Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.pom (140 B at 11 kB/s)
2024-05-18T07:47:46.4558356Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.6.2/velocity-1.6.2.pom
2024-05-18T07:47:46.4683075Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.6.2/velocity-1.6.2.pom (11 kB at 885 kB/s)
2024-05-18T07:47:46.4697453Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.pom
2024-05-18T07:47:46.4820369Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.pom (12 kB at 1.0 MB/s)
2024-05-18T07:47:46.4847934Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom
2024-05-18T07:47:46.4979662Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.pom (3.2 kB at 244 kB/s)
2024-05-18T07:47:46.4994207Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
2024-05-18T07:47:46.5119943Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 731 kB/s)
2024-05-18T07:47:46.5134826Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom
2024-05-18T07:47:46.5261620Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 2.1 MB/s)
2024-05-18T07:47:46.5281866Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/9.3/checkstyle-9.3.pom
2024-05-18T07:47:46.5437476Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/9.3/checkstyle-9.3.pom (142 kB at 8.8 MB/s)
2024-05-18T07:47:46.5573676Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.6.2/picocli-4.6.2.pom
2024-05-18T07:47:46.5748668Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.6.2/picocli-4.6.2.pom (1.4 kB at 76 kB/s)
2024-05-18T07:47:46.5762559Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.9.3/antlr4-runtime-4.9.3.pom
2024-05-18T07:47:46.5899567Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.9.3/antlr4-runtime-4.9.3.pom (3.6 kB at 258 kB/s)
2024-05-18T07:47:46.5910581Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.9.3/antlr4-master-4.9.3.pom
2024-05-18T07:47:46.6037448Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.9.3/antlr4-master-4.9.3.pom (4.4 kB at 339 kB/s)
2024-05-18T07:47:46.6051955Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.pom
2024-05-18T07:47:46.6182679Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.pom (18 kB at 1.4 MB/s)
2024-05-18T07:47:46.6205737Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/31.0.1-jre/guava-31.0.1-jre.pom
2024-05-18T07:47:46.6332317Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/31.0.1-jre/guava-31.0.1-jre.pom (11 kB at 914 kB/s)
2024-05-18T07:47:46.6346211Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/31.0.1-jre/guava-parent-31.0.1-jre.pom
2024-05-18T07:47:46.6469609Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/31.0.1-jre/guava-parent-31.0.1-jre.pom (14 kB at 1.2 MB/s)
2024-05-18T07:47:46.6487035Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.pom
2024-05-18T07:47:46.6610968Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.pom (2.4 kB at 201 kB/s)
2024-05-18T07:47:46.6620265Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/26.0-android/guava-parent-26.0-android.pom
2024-05-18T07:47:46.6747328Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/26.0-android/guava-parent-26.0-android.pom (10 kB at 783 kB/s)
2024-05-18T07:47:46.6763725Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.pom
2024-05-18T07:47:46.6893624Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.pom (2.3 kB at 175 kB/s)
2024-05-18T07:47:46.6906961Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom
2024-05-18T07:47:46.7029423Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom (4.3 kB at 357 kB/s)
2024-05-18T07:47:46.7038507Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom
2024-05-18T07:47:46.7159944Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom (4.8 kB at 402 kB/s)
2024-05-18T07:47:46.7172510Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.12.0/checker-qual-3.12.0.pom
2024-05-18T07:47:46.7293783Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.12.0/checker-qual-3.12.0.pom (2.1 kB at 161 kB/s)
2024-05-18T07:47:46.7305220Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.7.1/error_prone_annotations-2.7.1.pom
2024-05-18T07:47:46.7443758Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.7.1/error_prone_annotations-2.7.1.pom (2.1 kB at 151 kB/s)
2024-05-18T07:47:46.7458538Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.7.1/error_prone_parent-2.7.1.pom
2024-05-18T07:47:46.7583235Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.7.1/error_prone_parent-2.7.1.pom (7.0 kB at 537 kB/s)
2024-05-18T07:47:46.7598761Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.pom
2024-05-18T07:47:46.7723776Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.pom (2.8 kB at 212 kB/s)
2024-05-18T07:47:46.7736785Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/reflections/reflections/0.10.2/reflections-0.10.2.pom
2024-05-18T07:47:46.7861707Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/reflections/reflections/0.10.2/reflections-0.10.2.pom (9.3 kB at 776 kB/s)
2024-05-18T07:47:46.7874975Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.28.0-GA/javassist-3.28.0-GA.pom
2024-05-18T07:47:46.8040604Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.28.0-GA/javassist-3.28.0-GA.pom (11 kB at 675 kB/s)
2024-05-18T07:47:46.8056613Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom
2024-05-18T07:47:46.8185710Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom (3.8 kB at 295 kB/s)
2024-05-18T07:47:46.8198968Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom
2024-05-18T07:47:46.8322287Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom (14 kB at 1.2 MB/s)
2024-05-18T07:47:46.8338824Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/10.6/Saxon-HE-10.6.pom
2024-05-18T07:47:46.8478889Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/10.6/Saxon-HE-10.6.pom (2.6 kB at 186 kB/s)
2024-05-18T07:47:46.8492294Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom
2024-05-18T07:47:46.8625623Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom (31 kB at 2.2 MB/s)
2024-05-18T07:47:46.8641975Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom
2024-05-18T07:47:46.8776245Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 5.7 MB/s)
2024-05-18T07:47:46.8803483Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom
2024-05-18T07:47:46.8928758Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 kB at 425 kB/s)
2024-05-18T07:47:46.9041643Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.1.1/maven-reporting-api-3.1.1.jar
2024-05-18T07:47:46.9044721Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.jar
2024-05-18T07:47:46.9053319Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.0/maven-settings-3.1.0.jar
2024-05-18T07:47:46.9055948Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.0/maven-core-3.1.0.jar
2024-05-18T07:47:46.9061351Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.0/maven-settings-builder-3.1.0.jar
2024-05-18T07:47:46.9182877Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-api/3.1.1/maven-reporting-api-3.1.1.jar (11 kB at 754 kB/s)
2024-05-18T07:47:46.9186398Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.0/maven-repository-metadata-3.1.0.jar
2024-05-18T07:47:46.9211076Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/reporting/maven-reporting-impl/3.2.0/maven-reporting-impl-3.2.0.jar (20 kB at 1.1 MB/s)
2024-05-18T07:47:46.9214802Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.0/maven-model-builder-3.1.0.jar
2024-05-18T07:47:46.9222688Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.1.0/maven-settings-3.1.0.jar (47 kB at 2.6 MB/s)
2024-05-18T07:47:46.9229696Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.1.0/maven-aether-provider-3.1.0.jar
2024-05-18T07:47:46.9249913Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.1.0/maven-settings-builder-3.1.0.jar (41 kB at 2.2 MB/s)
2024-05-18T07:47:46.9252850Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/0.9.0.M2/aether-spi-0.9.0.M2.jar
2024-05-18T07:47:46.9312046Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.1.0/maven-repository-metadata-3.1.0.jar (30 kB at 1.2 MB/s)
2024-05-18T07:47:46.9315011Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/0.9.0.M2/aether-impl-0.9.0.M2.jar
2024-05-18T07:47:46.9333283Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.1.0/maven-core-3.1.0.jar (563 kB at 19 MB/s)
2024-05-18T07:47:46.9336076Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/0.9.0.M2/aether-api-0.9.0.M2.jar
2024-05-18T07:47:46.9378481Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/0.9.0.M2/aether-spi-0.9.0.M2.jar (18 kB at 553 kB/s)
2024-05-18T07:47:46.9381224Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar
2024-05-18T07:47:46.9390354Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.1.0/maven-aether-provider-3.1.0.jar (60 kB at 1.8 MB/s)
2024-05-18T07:47:46.9393031Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.jar
2024-05-18T07:47:46.9408062Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.1.0/maven-model-builder-3.1.0.jar (159 kB at 4.6 MB/s)
2024-05-18T07:47:46.9410990Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar
2024-05-18T07:47:46.9473908Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/0.9.0.M2/aether-impl-0.9.0.M2.jar (145 kB at 3.4 MB/s)
2024-05-18T07:47:46.9477475Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.jar
2024-05-18T07:47:46.9512079Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/0.9.0.M2/aether-api-0.9.0.M2.jar (134 kB at 3.0 MB/s)
2024-05-18T07:47:46.9521419Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
2024-05-18T07:47:46.9544363Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.jar (26 kB at 538 kB/s)
2024-05-18T07:47:46.9546336Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.jar
2024-05-18T07:47:46.9580203Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/0.9.0.M2/aether-util-0.9.0.M2.jar (134 kB at 2.6 MB/s)
2024-05-18T07:47:46.9582424Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4.2/plexus-classworlds-2.4.2.jar
2024-05-18T07:47:46.9592577Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.jar (210 kB at 4.0 MB/s)
2024-05-18T07:47:46.9594428Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.0/maven-artifact-3.1.0.jar
2024-05-18T07:47:46.9654568Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.jar (71 kB at 1.2 MB/s)
2024-05-18T07:47:46.9657059Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.0/maven-plugin-api-3.1.0.jar
2024-05-18T07:47:46.9662795Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 41 kB/s)
2024-05-18T07:47:46.9669272Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar
2024-05-18T07:47:46.9712930Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.4.2/plexus-classworlds-2.4.2.jar (47 kB at 723 kB/s)
2024-05-18T07:47:46.9716084Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.11.1/doxia-decoration-model-1.11.1.jar
2024-05-18T07:47:46.9759688Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.jar (425 kB at 6.1 MB/s)
2024-05-18T07:47:46.9767106Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.1.0/maven-artifact-3.1.0.jar (52 kB at 735 kB/s)
2024-05-18T07:47:46.9770148Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.11.1/doxia-site-renderer-1.11.1.jar
2024-05-18T07:47:46.9775376Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.11.1/doxia-skin-model-1.11.1.jar
2024-05-18T07:47:46.9797295Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.1.0/maven-plugin-api-3.1.0.jar (50 kB at 673 kB/s)
2024-05-18T07:47:46.9800554Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.11.1/doxia-module-xhtml-1.11.1.jar
2024-05-18T07:47:46.9850110Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-decoration-model/1.11.1/doxia-decoration-model-1.11.1.jar (60 kB at 757 kB/s)
2024-05-18T07:47:46.9853202Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.11.1/doxia-module-xhtml5-1.11.1.jar
2024-05-18T07:47:46.9864718Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar (153 kB at 1.9 MB/s)
2024-05-18T07:47:46.9867583Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.2/plexus-velocity-1.2.jar
2024-05-18T07:47:46.9906341Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-site-renderer/1.11.1/doxia-site-renderer-1.11.1.jar (65 kB at 767 kB/s)
2024-05-18T07:47:46.9909096Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.7/velocity-1.7.jar
2024-05-18T07:47:46.9919775Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml/1.11.1/doxia-module-xhtml-1.11.1.jar (17 kB at 202 kB/s)
2024-05-18T07:47:46.9924795Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.jar
2024-05-18T07:47:46.9926481Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-skin-model/1.11.1/doxia-skin-model-1.11.1.jar (16 kB at 188 kB/s)
2024-05-18T07:47:46.9927984Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.jar
2024-05-18T07:47:46.9990393Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-module-xhtml5/1.11.1/doxia-module-xhtml5-1.11.1.jar (18 kB at 192 kB/s)
2024-05-18T07:47:46.9992182Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.jar
2024-05-18T07:47:47.0030479Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-velocity/1.2/plexus-velocity-1.2.jar (8.1 kB at 84 kB/s)
2024-05-18T07:47:47.0033186Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.jar
2024-05-18T07:47:47.0115807Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.4/commons-lang-2.4.jar (262 kB at 2.5 MB/s)
2024-05-18T07:47:47.0118354Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.jar
2024-05-18T07:47:47.0142598Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity/1.7/velocity-1.7.jar (450 kB at 4.2 MB/s)
2024-05-18T07:47:47.0144791Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.jar
2024-05-18T07:47:47.0153780Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-digester/commons-digester/1.8/commons-digester-1.8.jar (144 kB at 1.3 MB/s)
2024-05-18T07:47:47.0159473Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar
2024-05-18T07:47:47.0168042Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-chain/commons-chain/1.1/commons-chain-1.1.jar (90 kB at 818 kB/s)
2024-05-18T07:47:47.0172399Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.11.1/doxia-sink-api-1.11.1.jar
2024-05-18T07:47:47.0231212Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/velocity/velocity-tools/2.0/velocity-tools-2.0.jar (347 kB at 3.0 MB/s)
2024-05-18T07:47:47.0234115Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.11.1/doxia-logging-api-1.11.1.jar
2024-05-18T07:47:47.0286120Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/oro/oro/2.0.8/oro-2.0.8.jar (65 kB at 535 kB/s)
2024-05-18T07:47:47.0292546Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.11.1/doxia-core-1.11.1.jar
2024-05-18T07:47:47.0302502Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-sink-api/1.11.1/doxia-sink-api-1.11.1.jar (12 kB at 94 kB/s)
2024-05-18T07:47:47.0305931Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/2.1.0/plexus-container-default-2.1.0.jar
2024-05-18T07:47:47.0357338Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-logging-api/1.11.1/doxia-logging-api-1.11.1.jar (12 kB at 91 kB/s)
2024-05-18T07:47:47.0360284Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.7/xbean-reflect-3.7.jar
2024-05-18T07:47:47.0383307Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/dom4j/dom4j/1.1/dom4j-1.1.jar (457 kB at 3.5 MB/s)
2024-05-18T07:47:47.0384846Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.jar
2024-05-18T07:47:47.0423952Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar (588 kB at 4.3 MB/s)
2024-05-18T07:47:47.0425818Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.3/commons-text-1.3.jar
2024-05-18T07:47:47.0449784Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-core/1.11.1/doxia-core-1.11.1.jar (218 kB at 1.6 MB/s)
2024-05-18T07:47:47.0452318Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar
2024-05-18T07:47:47.0483493Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-container-default/2.1.0/plexus-container-default-2.1.0.jar (230 kB at 1.6 MB/s)
2024-05-18T07:47:47.0485250Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar
2024-05-18T07:47:47.0540966Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/xbean/xbean-reflect/3.7/xbean-reflect-3.7.jar (148 kB at 1.0 MB/s)
2024-05-18T07:47:47.0544157Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.jar
2024-05-18T07:47:47.0638975Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-logging/commons-logging/1.2/commons-logging-1.2.jar (62 kB at 394 kB/s)
2024-05-18T07:47:47.0641897Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.14/httpcore-4.4.14.jar
2024-05-18T07:47:47.0680118Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-text/1.3/commons-text-1.3.jar (183 kB at 1.1 MB/s)
2024-05-18T07:47:47.0689632Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/collections/google-collections/1.0/google-collections-1.0.jar (640 kB at 3.9 MB/s)
2024-05-18T07:47:47.0692997Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar
2024-05-18T07:47:47.0709661Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.11.1/doxia-integration-tools-1.11.1.jar
2024-05-18T07:47:47.0738651Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.11/commons-codec-1.11.jar (335 kB at 2.0 MB/s)
2024-05-18T07:47:47.0743110Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar
2024-05-18T07:47:47.0756645Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar (780 kB at 4.6 MB/s)
2024-05-18T07:47:47.0762404Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.jar
2024-05-18T07:47:47.0841863Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.14/httpcore-4.4.14.jar (328 kB at 1.9 MB/s)
2024-05-18T07:47:47.0845183Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar
2024-05-18T07:47:47.0858634Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar (215 kB at 1.2 MB/s)
2024-05-18T07:47:47.0861626Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
2024-05-18T07:47:47.0887611Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar (85 kB at 469 kB/s)
2024-05-18T07:47:47.0889500Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/doxia/doxia-integration-tools/1.11.1/doxia-integration-tools-1.11.1.jar (47 kB at 257 kB/s)
2024-05-18T07:47:47.0891329Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.jar
2024-05-18T07:47:47.0892729Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/9.3/checkstyle-9.3.jar
2024-05-18T07:47:47.0910701Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.jar (4.2 kB at 23 kB/s)
2024-05-18T07:47:47.0913323Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.6.2/picocli-4.6.2.jar
2024-05-18T07:47:47.0957192Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-resources/1.1.0/plexus-resources-1.1.0.jar (23 kB at 123 kB/s)
2024-05-18T07:47:47.0960146Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.9.3/antlr4-runtime-4.9.3.jar
2024-05-18T07:47:47.1007870Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-i18n/1.0-beta-10/plexus-i18n-1.0-beta-10.jar (12 kB at 62 kB/s)
2024-05-18T07:47:47.1011439Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar
2024-05-18T07:47:47.1032959Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 1.4 MB/s)
2024-05-18T07:47:47.1038312Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/31.0.1-jre/guava-31.0.1-jre.jar
2024-05-18T07:47:47.1126628Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/info/picocli/picocli/4.6.2/picocli-4.6.2.jar (403 kB at 2.0 MB/s)
2024-05-18T07:47:47.1129560Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar
2024-05-18T07:47:47.1170366Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.9.3/antlr4-runtime-4.9.3.jar (337 kB at 1.6 MB/s)
2024-05-18T07:47:47.1176315Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar
2024-05-18T07:47:47.1180136Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar (247 kB at 1.2 MB/s)
2024-05-18T07:47:47.1184283Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
2024-05-18T07:47:47.1278367Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar (4.6 kB at 21 kB/s)
2024-05-18T07:47:47.1282793Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.12.0/checker-qual-3.12.0.jar
2024-05-18T07:47:47.1289895Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar (2.2 kB at 9.9 kB/s)
2024-05-18T07:47:47.1300629Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.7.1/error_prone_annotations-2.7.1.jar
2024-05-18T07:47:47.1303344Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar (20 kB at 89 kB/s)
2024-05-18T07:47:47.1305866Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar
2024-05-18T07:47:47.1428996Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.7.1/error_prone_annotations-2.7.1.jar (15 kB at 63 kB/s)
2024-05-18T07:47:47.1433109Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/reflections/reflections/0.10.2/reflections-0.10.2.jar
2024-05-18T07:47:47.1436231Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar (8.8 kB at 37 kB/s)
2024-05-18T07:47:47.1440336Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.28.0-GA/javassist-3.28.0-GA.jar
2024-05-18T07:47:47.1448718Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.12.0/checker-qual-3.12.0.jar (209 kB at 877 kB/s)
2024-05-18T07:47:47.1451713Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.jar
2024-05-18T07:47:47.1579630Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.jar (42 kB at 165 kB/s)
2024-05-18T07:47:47.1583132Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/10.6/Saxon-HE-10.6.jar
2024-05-18T07:47:47.1604732Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/reflections/reflections/0.10.2/reflections-0.10.2.jar (130 kB at 513 kB/s)
2024-05-18T07:47:47.1608732Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar
2024-05-18T07:47:47.1702647Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/puppycrawl/tools/checkstyle/9.3/checkstyle-9.3.jar (2.0 MB at 7.6 MB/s)
2024-05-18T07:47:47.1847229Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/javassist/javassist/3.28.0-GA/javassist-3.28.0-GA.jar (852 kB at 3.1 MB/s)
2024-05-18T07:47:47.1925724Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/31.0.1-jre/guava-31.0.1-jre.jar (3.0 MB at 10 MB/s)
2024-05-18T07:47:47.1934988Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar (587 kB at 2.0 MB/s)
2024-05-18T07:47:47.2629580Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/10.6/Saxon-HE-10.6.jar (5.8 MB at 16 MB/s)
2024-05-18T07:47:47.5122257Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/skins/maven-default-skin/1.3/maven-default-skin-1.3.jar
2024-05-18T07:47:47.5296000Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/skins/maven-default-skin/1.3/maven-default-skin-1.3.jar (14 kB at 766 kB/s)
2024-05-18T07:47:47.5315439Z [INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.3 skin.
2024-05-18T07:47:48.0186799Z [INFO] Starting audit...
2024-05-18T07:47:48.0189176Z Audit done.
2024-05-18T07:47:48.0201369Z [WARNING] Unable to locate Source XRef to link to - DISABLED
2024-05-18T07:47:48.0204690Z [WARNING] Unable to locate Test Source XRef to link to - DISABLED
2024-05-18T07:47:48.1314077Z [INFO] 
2024-05-18T07:47:48.1315630Z [INFO] --- maven-install-plugin:2.5.2:install (default-install) @ roman-number ---
2024-05-18T07:47:48.1359170Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.pom
2024-05-18T07:47:48.1504323Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.pom (11 kB at 744 kB/s)
2024-05-18T07:47:48.1541575Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom
2024-05-18T07:47:48.1679817Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/22/commons-parent-22.pom (42 kB at 2.6 MB/s)
2024-05-18T07:47:48.1729319Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.pom
2024-05-18T07:47:48.1863111Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.pom (4.0 kB at 311 kB/s)
2024-05-18T07:47:48.1887861Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.pom
2024-05-18T07:47:48.2012255Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.pom (3.1 kB at 262 kB/s)
2024-05-18T07:47:48.2060120Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar
2024-05-18T07:47:48.2063105Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.jar
2024-05-18T07:47:48.2065178Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar
2024-05-18T07:47:48.2068254Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.jar
2024-05-18T07:47:48.2073968Z [INFO] Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.jar
2024-05-18T07:47:48.2232409Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/classworlds/classworlds/1.1-alpha-2/classworlds-1.1-alpha-2.jar (38 kB at 2.2 MB/s)
2024-05-18T07:47:48.2286000Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.6/commons-codec-1.6.jar (233 kB at 11 MB/s)
2024-05-18T07:47:48.2288895Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/0.4/maven-shared-utils-0.4.jar (155 kB at 6.8 MB/s)
2024-05-18T07:47:48.2291852Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.15/plexus-utils-3.0.15.jar (239 kB at 11 MB/s)
2024-05-18T07:47:48.2296112Z [INFO] Downloaded from central: https://repo.maven.apache.org/maven2/junit/junit/3.8.1/junit-3.8.1.jar (121 kB at 5.0 MB/s)
2024-05-18T07:47:48.2560216Z [INFO] Installing /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/target/roman-number-1.0-SNAPSHOT.jar to /home/runner/.m2/repository/it/unipd/mtss/roman-number/1.0-SNAPSHOT/roman-number-1.0-SNAPSHOT.jar
2024-05-18T07:47:48.2577700Z [INFO] Installing /home/runner/work/ASSIGMNET-2/ASSIGMNET-2/pom.xml to /home/runner/.m2/repository/it/unipd/mtss/roman-number/1.0-SNAPSHOT/roman-number-1.0-SNAPSHOT.pom
2024-05-18T07:47:48.2629320Z [INFO] ------------------------------------------------------------------------
2024-05-18T07:47:48.2629923Z [INFO] BUILD SUCCESS
2024-05-18T07:47:48.2630416Z [INFO] ------------------------------------------------------------------------
2024-05-18T07:47:48.2642265Z [INFO] Total time:  9.145 s
2024-05-18T07:47:48.2644330Z [INFO] Finished at: 2024-05-18T07:47:48Z
2024-05-18T07:47:48.2644926Z [INFO] ------------------------------------------------------------------------
2024-05-18T07:47:48.2905489Z Post job cleanup.
2024-05-18T07:47:48.4467829Z [command]/usr/bin/tar --posix -z -cf cache.tgz --exclude cache.tgz -P -C /home/runner/work/ASSIGMNET-2/ASSIGMNET-2 --files-from manifest.txt
2024-05-18T07:47:52.0062654Z Cache Size: ~28 MB (29455931 B)
2024-05-18T07:47:52.0990209Z Cache saved successfully
2024-05-18T07:47:52.1056383Z Cache saved with the key: setup-java-Linux-maven-d4ef336fff17db49e7987181783800c2f6ec0065fe30497af8f3368f59f4ab2c
2024-05-18T07:47:52.1201165Z Post job cleanup.
2024-05-18T07:47:52.2046990Z [command]/usr/bin/git version
2024-05-18T07:47:52.2094706Z git version 2.45.1
2024-05-18T07:47:52.2136487Z Temporarily overriding HOME='/home/runner/work/_temp/505d211f-936f-49db-9488-69b0261f9602' before making global git config changes
2024-05-18T07:47:52.2138392Z Adding repository directory to the temporary git global config as a safe directory
2024-05-18T07:47:52.2143799Z [command]/usr/bin/git config --global --add safe.directory /home/runner/work/ASSIGMNET-2/ASSIGMNET-2
2024-05-18T07:47:52.2187115Z [command]/usr/bin/git config --local --name-only --get-regexp core\.sshCommand
2024-05-18T07:47:52.2227448Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'core\.sshCommand' && git config --local --unset-all 'core.sshCommand' || :"
2024-05-18T07:47:52.2486569Z [command]/usr/bin/git config --local --name-only --get-regexp http\.https\:\/\/github\.com\/\.extraheader
2024-05-18T07:47:52.2516426Z http.https://github.com/.extraheader
2024-05-18T07:47:52.2529202Z [command]/usr/bin/git config --local --unset-all http.https://github.com/.extraheader
2024-05-18T07:47:52.2567595Z [command]/usr/bin/git submodule foreach --recursive sh -c "git config --local --name-only --get-regexp 'http\.https\:\/\/github\.com\/\.extraheader' && git config --local --unset-all 'http.https://github.com/.extraheader' || :"
2024-05-18T07:47:52.3042428Z Cleaning up orphan processes
