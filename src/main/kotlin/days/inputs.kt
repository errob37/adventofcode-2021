package days



val day10TestInput = """
    [({(<(())[]>[[{[]{<()<>>
    [(()[<>])]({[<{<<[]>>(
    {([(<{}[<>[]}>{[]{[(<()>
    (((({<>}<{<{<>}{[]{[]{}
    [[<[([]))<([[{}[[()]]]
    [{[{({}]{}}([{[{{{}}([]
    {<[[]]>}<{[{[{[]{()[[[]
    [<(<(<(<{}))><([]([]()
    <{([([[(<>()){}]>(<<{{
    <{([{{}}[<[[[<>{}]]]>[]]
""".trimIndent()

val day10Input = """
    <{[[({([{<[[([()<>]<<><>>)<[[]()]{<>()}>][<(()[])<()<>>>]]<(<(<><>)(())>)[<([]()){<><>}>{{()<>}<{}>}]>>[({
    <<({<{{{[(<{([{}{}]{{}[]}){({}())}}<<[[][]](()<>)>[{<><>}<{}<>>]>>(<[[()]([]{})]((()<>)[()()
    ({<<({[<[[<[([()])]<<<{}<>><()[]>>[[()<>]<[]()>]>>([((()[])[()])]{[[()()]<<><>>][{<>[]}(()<>)]})
    (([[<<[{(({{{(()<>)[()()]}[({}<>)[[][]]]}([{{}<>}<[]()}]{[[][]][()<>]})})(([({[]{}}{[][]})
    ({{<[[<<{{[{[<{}{}>{[]{}}]<([]{}){()[]}>}]<{([<><>]([]<>)){({}())({}<>)}}[[<{}<>>([]{})][[()[]]]]>}}>>]]
    [(<<<{([[[<{(<()<>>{<><>})(<[]<>>([][]))}[<[{}[]]>{<[]>(<><>)}]>([{{[]()}{[]()}}([<>[]][{}<>
    <[{[{{([<(<{{[{}<>]({}{})}{{<>[]}(()())}}(<<<>{}>(<><>)>(<<>{}>[[]<>]))>)>[{[<[[()<>]{{}<>
    {(<<[([<{<<<({()()}(<><>)}{((){})([]())}>>[<{<[]<>>{[]{}}}([()()])>]>}>]{{([{<{{[]<>}(<>)}<({}(
    ((<[{(({([<{(<[][]>)[<<>{}><()<>>]}<{<{}{}>}[{()[]}<{}[]>]>>])})<[{[{([{[]()}((){})][<<>()><()()>])>]}][[({{[
    [[{([[<<[({[<<[]{}>{[][]}>(<()<>>[{}()])][([{}[]}[<><>]){[{}()]}]}[<<<{}<>>{()<>}>(<{}()>([]()))>{[[<><>][
    {{{<[([[{<[<{([]{}>{<>()}}{<(){}><()()>}>[{[[][]](<>())}[{[]<>}[<>[]]]]]{<{{{}[]}{<><>}}[[()()](<
    (([{(({[[[[{(<<>[]>((){})){<()<>><[]{}>}}{[{{}()}(()[])]((()){()<>})}]]]<[<<{(()[])<{}[]>}{
    {<<([(<([{{(<(()<>)[[][]]>{[[]{}]{(){}}})[{<(){}>[[]<>]}]}}])[[[([[{()()}{<>[]}]{[()]{[][]}}]<[((
    [{<<{<([(<[<{<{}[]>{{}[]}}(([]()))>{([(){}]<()[]>)(<[][]>{[]<>})}]>[{<<{<>()}[{}[]]>{(<><>)}>{[<[]<>>{()[]}]<
    <{{<{[[{{([({<()>{(){}}}((<>[])(<><>)))[(<[]<>>[()[]])<<()()>{<>{}}>]])<[{[{[]<>}{()()}][[{}{}]<[]>]}<{{{
    [(<[{([{({<<[<<>()>[[]()]]{<<>{}><{}<>>}><{<()()>{{}{}}}(({}<>)<()<>>)>>})({(([<{}<>>{[][]
    {(([{[<{{[({{[{}<>][()]}<{{}<>}>}(({<>[]})))]{((<[<>{}][<>[])>[[<>()]{[][]}]))<<<({}<>){{}<>}>(
    {[<{({((([[{[(<>{}){<>()}][([]{}}]}]{[<(()()){[]()}>((<>[])<(){}>)]}]){<(<<{{}<>}>>)([[{<><>}<
    {<{[(<{<[({<<[<><>]{()()}>[{()<>}<{}>]>[[<[]>][{()[]}{()}]]}(<(({}()){<><>})<(()())[<>()]>>{
    <[({[[{<([[{<{{}}>(<<><>>{[]()}}}[{{<>{}}<()<>>}{[[][]]{[]<>}}]]<((([][])<<>{}>)<((){})[{}()
    {{[{<[{<<{<<(<{}[]><(){}>)<{<>[]}[{}()]>>[{{[]<>}<()<>>}[{{}<>}(<>())]]><[(({}<>)({}<>))<<{}<>><<
    {<<({(<[(<[[{{[][]}{{}}}<[[]()]<<>())>]](<{{{}<>}{()<>}}>)>)]<(({{[[[][]]]}<[[(){}]<[]{}>]>}))>
    ({{([<<{[(<<{{<>()}<[]()>}<{(){}}{{}{}}>><(<{}[]>{<>{}})<([]<>)([]())>>>)]}>>[[{<{[<<(<>{})
    <{({{({<<[{<<{<>}{{}[]}>>[[{[]<>}{()()}]<<[][]>(()())>]}]{<<{[(){}><<><>>}{{<>[]}(()<>)}>[<<(){}>[[]
    <({<([[[([({<{(){}}([][])>}<[{[][]}{<>()}]<[(){}][{}<>]>>){<({{}()}{[]{}})>{[{[]{})[()[]]]<[
    {([({[(([<{((({}()){{}<>})(<()[]>{()()})){[({}{})<<>[]>]([{}][()])}}>]{<<[<[[][]]{[][]}>({[]{}}<{}()>)
    <<{[<({[(<[({<{}{}><()()>})]{<<[<><>]>>}>){{[((<<><>><{}[]>)){<{[]()}(<>())>}]{{{({}<>){[]<>}}{{
    <<({<[{(([{({({}())(<>{})}{((){})})[<[[][]]([][])>]}<<[[<>{}][[]<>]]<([]<>)[()()]>><<<{}[]>(()())>>]])[[[
    [{<({<(({([([{[]}]<{[]()}[()<>]>]{{(()())<{}()>}{{[]()}<()<>>}}][{(<[]<>>[<>{}])[<[]<>><<><>>]}<(<<
    <{{((<<(<{({<{<>{}}[[]{}]>})[[{{[][]}{{}<>}}]]}[(([(()[])<()<>>]((<>[])<<>{}>))<[[<>()][<>
    {[([<<<({[{<<[<>{}]<[]<>>>>({<<>{}>((){})}<{[][]}{[]{}}>)}<{(([]{})<<>>><{{}()}(<><>)>}<{<[]
    <({[[{{{([(({[{}<>]{[]<>}}[{()<>}<(){}>])<[<{}()>[[]<>]]>)]{{[<{<>()}[{}()]><<<><>>{[][]}>]([[[][]](<>())
    [<<{{<[[{[<(<{()[]}[(){}]><[()[]]<<>{}>>)>[[[[[]{}]{[][]}]{<[]{}><(){}>}]({{<>()}<<>{}>}({()<>
    [<[[(<[[[[<<<{()<>}[[]()]>>{[[<>[]]{[]{}}]{[<>[]][[]<>]}}>]]({[({[<><>]<{}<>>}<<(){}>[{}()]>)[[<<>
    <{{({<([{({({{{}()}((){})})([([][])[[]<>]](([])[{}<>]))}<(([()<>][()[]])[<[]><{}{}>])<{({}<>)<<>()>}
    {<[[[([{[<<(({{}<>})(<{}()](<>{}))){[[<>[]]({}<>)]}><[((<>()){[][]})[({}())<{}<>>]]<({<>[]}{{}<>
    {<[<[({<({(<(({}[])<{}>)((<>[])({}<>))><(([][])(()()))>)})({{({{<>())}<{<>()}([]{})>)[[(()<>)<<>[]>](<<
    {(<(<<{{({{<{(<>[])[[]]}{(<>{})>>{<(()())[{}{}]>{{[]{}}{{}<>}}}}(<{[{}[]]<(){}>}[[{}{}]{()<>}]>([{<>{}}[<>]]
    [{[{{[[[{([<(({}{})<[][]>)<([]{})<<>{}>>>[{[[]{}]([]<>)}{(()())[<>[]]}}]((<([]<>)[()<>]>(<{}()>)){<[<>[]](
    {<<<<{(({<<({(()())(<>{})}<([][])[[]()]>)[{{[]()}(<>)}]><{[<<>()>]{<[]()>[[]<>]}}>>}>[(<<<[{()<>}{{}<>
    [{[(<[<{<[({[{[]<>}<[][]>]{{<>()}}}[({<>[]}{{}{}}){[[]<>](<><>)}])({({{}<>}<{}<>>)}<[((){})[{
    {<[[{[(((<({([[]<>](()<>))}[{{()<>}({}())}(<[]{}>{[]{}})])<<(({})[{}{}])[(<>{})<()>]>>>))<[{{<[{{}<>}[[][]
    [[<<([{<{((([<{}{}>(<><>)][({}[])])[[(<>{}){{}<>}](<()[]>[[]()])])[{({()}{{}{}})(({}())([]{}))}({[{}[]]{
    <<((<[<(([<{[<{}<>>][<{}{}>{{}[]}]}[{<<>()>[[]{}]}{[()[]]([]{})}]><{({()()}{[]})<{[]()}[{}{}]>}{((<>(
    ({<<{[(({{<<{[[]()]{{}()}}{[<>{}]<[][]>}>{(([]())[<>[]]){<[]{}>{<><>}}}>{{{{<>[]}{{}()]}{{<>{}}[{}{}
    {((<<{<<<((<(({}{})(()))[[()()]{{}<>}]>{(<()[]][{}[]])[[<>[]]<<>>]}))>([[{({()[]}{()[]})(<[][]><{}{}>)}[[[[][
    [(<<{<[(<([<(<[]()><()()>)>]{({[<><>]{[][]}})}}<[([(()())[{}]]<<(){}>[<><>]>)][<<((){})>>[[{<><>}[{}()]][([]
    [<{[<[[(({{{[<{}[]><<>{}}][[{}<>]<<>()>]}{[{[]}[{}[]]]{[()[]]<{}<>>}}}[({<(){}>{{}{}}}<(()[])(
    <{([{(<[<<<<[[{}{}]([])](<{}{}>[[][]])>{{(()[]){<>[]}}<[<><>][(){}]>}>(([[{}{}]{{}<>}](<()()>))<<(<>{})<<
    [(<[[[[(({[<<<<>{}><<><>>>>]<{[{{}<>}<()>]{{[]{}}[<>[]]}}<<<()[]>([]<>)><(<>{}){[]()}>>>}))[[([{<
    [([(({<{([<[({{}{}}<{}{}>)[[[]{}]({}<>)]]<[([]<>)({}[])]{(()[]){[]<>}}>>{[<{[]<>}>{[()[]]<()<>>}][<([
    {<[<[[<[{({{<[[]()][{}()]>({()[]}(()[]))}([[<>()]])})}{{<{{[<>]<[]()>}{<{}[]]}}<{{()[]}<[]<>>}([()()]<{}()>)>
    [{{(<(([([((<{{}{}}({}())>{{<>[]}<[]{}>})([{<>()}{{}<>}]{<()<>>[{}{}]})>]{{[<(<>){[]{}}>{<<>[]>[()[]]}]
    [<<(({[[({({[{[]{}}<<>[]]]{[()()]<<>()>}}{[{<>[]}<()>]}){{<<()[]>{[]{}}><<<>>[[]()]>}}})<[{{[<
    <([{{{(<{{{<<({}()){(){})>{<{}{}>{<>()}}>{(<()[]>({}()))<({}())<()()>>}}[(({[]{}}[<>{}])([{}<>])){{{{}}(<
    <<{[{[[<([[<(<{}<>><()[]>)<{<>()>[<>()]>>]][{{{{()<>}<{}[]>}[<[]()>[()[]]]}<{[{}](<>{})}>}[<[[<><>]<
    [{[([{<<[([[{<<>[]>(<>())}((()())({}{}))>{[({}())<<>()>]<(<><>){()<>}>}]({([(){}]<[]<>>){<[
    [{<<[[<((({[<[[]()]>(<<>>(<>{}))]<<([]<>)[<>{}]>{<[][]>(<>())}>}(([{{}<>}{{}[]}]{[()[]]{{}{}}})<
    ([<<{[([[<{<{({}())}{(()<>)}>[<[{}<>][[]()]><[<>{}]({}[])>]}<[([<>()]){[()<>]([]{})}][[[{}[]]][
    <{[[{({<{(<[[(()[])<<>[]>]<<<>()>{[]<>}>]>{[<(<>()){<>[]}>(([][]))]([<[]<>><{}{}>]([<>{}](()()
    {[([{{(([[<{<[{}<>]([]{})>[((){})<()[]>]}[[{{}<>}<[][]>]<{[]<>}([]())>]>{<{{{}<>}{(){}}]{{[]
    [{{<[([<{[[({[{}[]][(){}]}<{<>()}<[]{}>>)]<<({()<>}[[]()]){[<>[]]<()()>}>>]{[<<(<>[])<[]<>>
    <[{<[<((<({[{[{}[])(<>{})}(({}[])[<>])]})>[[([{((){})<<>>}])[<((()<>)[{}{}])[[(){}]]>{<<{}()>{
    ({[[[[[[[<((<[<><>][()[]]><(<><>)>))>{{<(<<>[]>{{}})[[[]<>]({}())]><{{()<>>[[]<>]}[<{}{}>{<>{}}]>}[{<(<
    ([([(<[{<[[{<{<>[]}>{{{}()]<{}()>}}<([{}()]{{}<>})[([][]){{}<>}]>]{<{{[]{}}{{}<>}}<[[]()]>>[[{()[]}{(){}}]{[
    {<{([([{<<<<{[<>()]<[]>}[[()<>]<()>]>>(([[<>[]][{}{}]])((([][]){<><>})([[]{}]<()<>})))><{<<[()()]<[]()>
    [{({[{[(([([{{{}<>}{()<>}}(([]<>){{}{}})][<{()}{{}{}}>(<<>()>[<>()])])]))<<<({((<>()){[]{}})[{
    ([([(<(({<(<<<{}[]>){{<><>}[[]{}]}>[{{[][]}<<><>>}])<{<<[]>(()[])>[[{}()]<[]<>>]}{({[]()}[<><>]){{{}[]}[{
    {{[{<{((<((<<<(){}>>{([]{})[[]()]}>([({}{})]{<()>{[]{}}}))[[(<<><>>)]<<<{}{}><(){}>>[({}[])({}
    <{[({{<<((([[[(){}][{}<>]]<(<>[])<[]()>>]<[[{}()]({}())]>)({<[(){}]>{(<><>){[]{}}}})){{{<<[]()>[()<>]>[<
    (<[[(<((<[[<{[[]()][()<>]}<[[][]]<[][]>>>((({}())((){}))(<{}<>]{()()}))]]>[[{<{[{}<>]}>([[{}<>](()
    <<<{<(<[<{[[([<>()][()<>])(<<>()>[{}()])][<{<>()}>]]}<<<({<>[]}([]{}))<<(){}>>>[[({}())(())]]>{({({}[
    ([<<<{<{({<[{(()<>)<()()>}]<[({}<>)]>>{[[{<>{}}(()[])](<<>>[[]<>])]}}{<<{<<>()>}><{{<>()}<<><>>}{<(){}>[(){
    {{(<<[{{({({({[]()}<{}()>)(([][])[()<>])}<{(<>())[()<>]}>)[[(([]<>)[[]<>])]]}[({[({}()){{}>]})
    <((((<{{{{{[{[(){}]([][])}[{<>{}}([]<>)]]([((){})]<[[][]][<><>]>)}}<(<{(()<>)([]{})}><([()<>]{<>()
    <{<{<(<(<<<(<[[][]]<<>()>><[<>[]][[]]>)[<[<>{}][<>()]>]>{<{(()){{}()}}[<{}<>><<><>>]>[{<{}[]><<><>>}]}>{(
    {[{<<(<([({{<<[]<>>[<>{}]>{<{}<>>([]<>)}}([<<>{}>((){})}<{<>[]}>)}<<({{}()})<(<>[])[[]]>>[[<<>[]>{()[]}][[[]
    <<<<[<{<[{{(<[<>]<[]{}>><(<>{}){{}()}>)[[{<>{}}{{}[]}](<[]>[<>{}])]}{{[{{}[]}(()<>)]<([]())(
    [([({[[{<{{<<{()()}<{}{}>>({{}{}}[{}{}]>>[{(<>{})<()()>}[[<>[]]<{}()>]]}[<<{<><>}(()[])>(<{}[]>
    [<<[[(({<[[([(<>[]){()[]}][(<><>)[<>[]]])]<({<{}{}>(()[])}[<{}<>>({}())])((({}{})<{}[]>)[{{}<>}{{}{}}])
    (({({[<<[<[([<<><>){[]{}}][<()<>><[]<>>])({[{}<>]<[]<>>}<({}{})[{}[]]>)][{((<><>)(()[]))}[<<{}()>{<>
    <((<[(<(<[[([{(){}}<<>()>]({(){}}{(){}}))]][{{[{[][]]{<>{}}]{[{}<>]([]{})}}}[<{[[]{}][<>()]}[(()[])<
    {((<<{({<[([(([]())([]()))(<[][]>{()})])<<[<<>[]>[<>())](<()<>><()()>)>>]>{{[{<[<>{}]<[]<>>>}<{{<><>}<
    {<<<<[((<{({<{<>[]}{<>()}><{<><>){<>()}>}([[[]()][(){}]]<<()<>>{<><>}>)){[{{<>[]}{[]()}}{(<>())
    ({<<<<[{<{<{(<{}{}><()[]>)[{<>{}}]}>(<[([]{}){<><>}]{<<><>>[()[]]}}<[{()[]}{()[]}][{{}[]}{[][]}]>)}>}]
    ({({{<{{{[<{{(<><>)}({[]()}{<><>})}{<[{}[]]<[]<>>>[(<>[]){()()}]}><[[<<>()><[][]>]]>]<<[{[[]()](
    <{[<([<[({([{(<>{}){()}}<([]<>)[{}{}]>)[[<()[]><{}<>>][(<>{})[()()]]]){<{({}){{}{}}}<{<>()}[[
    {((({[{<{[<({[{}()]({}{})}<(<>)(()())>)({[[]{}](<><>)}[<<>[]>[<>[]]])><<[{[]<>}][([][])<[]()>]>(
    ({[((([<[(<{[(<>[])(()[])]}<[([][])([]<>)]<(()())>>>((([(){}])<(<>())<<><>>>)<[[()<>>{{}{}
    [{{((<{[(<{[{{[][]}{<><>}}[[()[]]<[][]>]]<<({}[])((){})>>}>[(<([[]()]<{}[]>)([{}<>])>({<<>[]>(<>[])}[(
    ((<((<[<(<[{(<[]()>[()[]])((())(()[]))}{[[{}<>]([]{})]<[[]()]>}]>)><([<[<{[]<>}<{}[]>>[[(){}]]]({[[][]]{
    [(([([(([<<(<{<>}{[][]}>)[{[()<>]{{}{}}}({{}{}}<[]()>)]>>{([({<><>}<[]>){<{}{}>[()<>]}]<<[[]{}]{{
    [(<{<[[{[<<{<[[]<>]<[]()>>{{[]<>}}}><[[{{}()}([]<>)]][({{}<>}{{}{}})<[[][]](()())>]>><<({([]{})<<>{}>}){
    <{[<[(<<[[[[{<{}[]><[]<>>](<{}[]>{()[]})](<[<>()][[][]]>([()()]<<>()>))]]({([<()[]>[{}()]])<{[[]()]}{<[][
    <{{{([[([{{{<({}[])>}}<<({<>{}}{{}()))<({}{}){[]{}}>>[[(<>())[{}[]]]<<[]{}>{<>[]}>]>}([{[<<
    [{<(({{<[{[[([<>{}]{<>{}})(((){})[{}[]])][{<{}<>>}[([]{})<{}>]]]}{<<([<>{}][()[]})[{{}}<{}()>]>(
    [((<[{<<[<[{[{{}()}[{}[]]]<[<>[]][{}<>]>}]>]{[([([[]<>]{{}[]})[<(){}>[()[]]]]<<({}[])<[]()>>[(
    [{([<{([(({(<[[]<>]>{({}()){<><>}})([([]())[[]<>]])}(<[({}())(<>())]<{()<>}[[]<>]>>)){{([[<><>][()[]>](<[][]>
    <<(<<<{{{<<(<<[]<>>{<>()}>[<[]>])<{<{}<>>}{[{}{}]<<>[]>}>><{<<<>{}>({}<>)>}{([()[]]<<>()>)(<<><>><[]{}>)}>><
    {[<<[{{(<<[((({}{})[{}{}])(({}<>)[{}()]))]>{([[[(){}]<{}<>>][[{}[]]{()[]}]](<{[]{}}(<>[]>>))}>)}[(<
    <{{[[<[[[(((({<><>}{{}{}})<[<>()]([]())>)[<{{}<>}>{((){})[[][]]}]))<{<{[[]()]<[][]>}{<[]<>>(<>
    {<[<<([[[[{{<({}<>)<{}()>>[(<>())({}[])]}<{([][])({}<>)}>}(({[<>{}]{[]{}}}<(<>{})>)[<{[][]}{[][]}>{({}()){
    [[({{[(((({<{{<><>]}{(<><>){<><>}}>(<[()<>]<{}{}>>((<><>){<>[]}))}{<[[{}[]]([][])][{{}[]}[
    [{{<([((<<{(((<><>)<(){}>))((({}[]){<>()})(<{}()}({}{})))}><[<<{<>[]}[()<>]>{[<>{}]{[]()}}>{{
    [<{<{{({{<<<{[<><>]<[][]>}<<(){}>(<>)>>>([<{[]()}{{}[]}>{<{}()><[]<>>}]([([]())[[]]]([[]()]<<>{}>)))>
    <[{<[(<{{([[<[{}{}]><([]<>)(()())>][<((){})[[]()]>[([]<>){<><>}]]]{<{<[]<>><<>>}{<{}<>><[]{}
    {[((((((({([([(){}]([]<>)){[{}](<>[])}]{[<<>()>([]<>)]<<[][]>{[]<>}>})<<[{{}[]}(<><>)]<[()<>]
    ([({(([[[([[((<>{}){{}{}}]{[()<>]((){})}]((({})(<>[])){[{}{}]<<>()>})]{({(())[<>{}]}((<>{})
    {<[<{(<[{<[{(<{}()>)[<<>[]>(()<>)]}([{()[]}<{}<>>])}(({<[]{}><{}{}>}([[]<>]{{}()})){[[{}<>]
    <<({[[<<[([(<[<><>]{<>{}}>{<(){}>(()())})<{[<>{}]<()[]>}>]<{[{<>{}}<<>()>]<{{}()}[()<>]>}<[[{}<>][{
""".trimIndent()

val day9_test = """
    2199943210
    3987894921
    9856789892
    8767896789
    9899965678
""".trimIndent()

val day9_input = """
    9756789545987652345891012367899989991359999866435974321921234989994346679898799998765498765435697654
    6545898959876541236789245458989878989498987654323965639892949878989134569656678997654349979856789543
    5434567899765430445678997969876569878987699543219896798789894365678945698744567998765134598767899432
    6545678932984321267789789891997678967896598759909789987676789234789659987632456789654356789878978921
    7657789793965432457894698790198989456789479898898667896555678945678978997543867898785467893989567892
    9869895679876566568923987689249992365892357987676557899434567896989989987656789939996579932193456943
    4989954234989878679019876578998991234595456796543434678923678999898799998789899123987989521012397894
    3496543129998988789329876439977789345789597987632129789212349998789698989897978994598995432426789965
    2129692098987599998998765329865678968997678998549098994323567987678987678976665989689876543534999876
    3098989987595434567899876434974567899398789987698987896434989896557996567895434878999987854545678998
    5987678976434323568967986549865678943239892098987676987976898765346799678994323469439998966656799109
    9876567897321012678957797656976899655399989999876545898987979943235678989986554568998999987767988912
    9965478989432324589345698898989938966989978899989656789399865432133788993297676689987894398979877894
    9854365679645465678956789999990127899879867789199987891245998943012456789198787998656789239998656789
    8743234568956977899767998788954356998765945691019998943356987875123869891019899876545678945987545689
    7654565699967989998978987687895968998954323989198789659767996543234789999999939867634569999876434799
    8765776789878998767999096556999899987643219878987698798999898865345679987889129954323456789987545989
    9878987895989987656789195348986789398764329767976549987876799876456789996678998765434667896987659978
    4989298934599999732678989199875995499875498656896539876545689998767999954567899878545789945699798767
    3494349210298797653567967988954896989976987645689321987436578999898999893456899989876893434923989856
    4599959921298598787679459976543789978999876434589210976523459899999976742347978992987942129899876432
    5987897893987329898796567987665679567999654323568929897735598789998765431234567893999891098789765421
    9996456789876534999897698998987789459898721012478998789896698678999976210123456999898789997659875432
    8965347899989676799998999239898891298765432153459987678987966539987894323234567896789679898545987644
    7996756789499897989989987546789920989878543264567896569999854324456789534345678965394598765434698756
    6789767892349989878975599767896439876989765345688923478999784213345678946456799876213459876723459887
    5678978921298976567894409898989598765699987656789212599987652101234789987567899764302398785412345998
    4449899910987665456793219979878997954569998987897423689998543212345896599878999543213987654324456789
    3239789899876534367894998764769886743467899498986564799987656423456789445989398765454999785457567899
    4598566798954321256789869843459765432356974329299875678998767634567995234799209876579879876569678998
    5986454677894310345898954994569874321678965410123986789469878747679654345678999997679865987689789877
    6797323476989321238997899989689987434589654321244597893342989656789765467889989998989996898999898756
    8983212345678932346986997879999876565698765434456798932101298977899876988999878999993987919999959843
    9975903559789994569975986567896987677899876545587899653214397989989989899019767898912398909898943232
    4599899678999989798754578456955698988923997658698998794329976595678998789129654567893459998767892101
    5987788989999878998543462349543459899019898779789989989498765434569987679398743979999767897655589312
    9876567899898767987662101268942398789298629989899877568998755323498656568999999890198978998543478923
    9895456798786545698778232358931987699497545699999865456977644212987545457889878789987899987632767894
    8754234596565434797654345667899876568987676789988784345965432109876532345678965678976789876521256789
    9764345789432123459765456779999875457898789999879651299879645213989921237899234569895789765430138894
    9865756896543016569876767893498766346789894345965432989998759324599820126921012379784698654321239995
    2976787998652127678988878932398754237899953239876544979329878435798762245933126498653789785434346789
    1297898999763346789399989901249832126989762123987959868910987656789954349894598989762239896565656994
    0129969899874557895212999899498744335678921014599898957891298767998766498789679876510147997677878923
    1998654698986667894329896788987656567899432345698767545792999878989878987698989989324235698988989212
    9887643567898989965598765677598767779988943456796653438689879989678989876567891098945356789799999909
    8798432345999298978987654356459878989767894677985432123578968994568998797456992987897459895678999898
    9654321456890197899097563234346989995456795989877321017679356795679999656356789876789567954567898767
    8765430127789986792198432101245699876345899898765432128793245789989987943237998765698978993498987545
    9876541235699975679239983432367898765456987659876543234892125989999986542126789654567899689999896536
    2987678346988854568949876543478949876597998767987654356943014579989876531045897543456912567898789747
    1298898769876743457899987654579134987678939898998765467897123468967987432236986421257893478967678958
    0199959899765322346789799867898995999789023999999887678995434679656798543987895432348994589656569899
    9986545998754301258897658978956789879895235699988998789987556989769899864598976553656789696545456789
    8765434459643213478976546989345678967994345789767899896898678999898989765899987698767898789434345898
    9876321398954344569987697991236789456987656799856789954779789768997679876789298789878999899321234987
    2995456987896476778998989754347894312398768987545878923569896659876545997894349996989999998939359876
    1987569876789569899249878965456965323469879876534569012345964345987432198989498765699989987898967965
    0198678975679978954399867896567899434599989987545679923469876239764321019678987654569979546757799654
    3239989764567899967976556899778978949978993098656897896598754349989433124599998765798767632345678943
    4599899865698999879865445798989767898767892129789976789679875698998765355678999879987654341296799432
    5988767978969789998765334567893458989656789399899765678989996987659889467789899998998793210989989949
    9876543989656678987654125678942349876545679989998976789699999876546996578996799987999989349878567898
    6565432391234569998543276889543456985431098876767897899598799988632987689545678956899878998767479967
    5432101239345899998667989997675669876545987854356789968987689999991998795435789445698767999843234556
    8556214398996799898778999998787899987659876543248895459876578999889899899556895334989656789654012345
    7679345987889988759989978899898999999878997652101979398765456798766789998787954129876545699964144569
    8798956986679876543598767698999998889989019654214568998654334989655679219899543012965434759893234578
    9987899765498765432489656597899987679993198784323679876543129876544598923965432129877521238789345679
    9765978964349876421278945456799876568943239875634789988651012987623467899987653235999430145678968789
    8964568991256995432359932345679987459855945987845899997762129875434568978998864356986543236899879897
    7843456989346986548767891234878996598769896898956999876543434986645779767879985467897856545999989986
    6532345678967987669878910123567897679898789999767899997655645698756898658769876778998987656789997675
    4321234789879299879989892344579999999987689989998999898966758789867987845459989899899199787899896543
    3210345897989129997998789456689988878996569879329998789897969895978976432348994966799019899978795432
    4321296896591097856897678967789876569895454768910987656799892924989986521467893245678929956965679321
    6542389989432976545734577899893985498764343456891298545698791012597895430349964346799998767894578910
    9543578978949865434823456789932987679863212347892999935797689133456789421258975959899989878943467891
    8754699567899876321012567893201298789756101356789899896986578994567899532367976778987975999892348989
    8767976456912986542153457954314349897543212467896798789876459789688998943489997889676899976790199878
    9898995345893498543464768965326456999656353478945987678954345678999987894598789996545998765891989767
    3919894236789987655575889876539567898767764589439876569895234589998776789679565899876989876799875656
    2109789129894298967989999989798978999978879789520995436789125678999654568989434789987976987987684545
    3998679298932129878996899998987899999989989997621986545678976789898768679997645678998965799896543334
    9877568997893245989345678997676798989993498765439997876789499895699879789898796789769876898789932123
    9965479876789346790123789976585987678891989976998998987896321934987989896789989999953987987667899014
    7654398765695456989545699985434976567789878989897849798965490129996793935679879899892098998545678923
    8743219754989579879956789496929895434678966799765434659896989298765432123569767676789159995534567895
    9854598853878998767897992349899789323789655679876210346789979349896541012998756545679234974323567896
    8765997542367889658989321098785678934578934567985421235899767956989432129876543236799399863212455689
    9879876521345678947678932297654569965989312399876534569967656797977993234997432145678987654201234678
    5989854310456899434567894598765789876792105789997945678954546989865789945696549236799398765629346889
    4198764321697974325778998679986993989893234578999896989543535976984567896989798947893219876548956789
    3019878932789765534568998799987894599954345699998789895432123495432378999878987899942101987656787895
    2123989549898987689679439989998965698765456789987678789594345989543489998769556678943219899987998964
    4257898678977698789989549878999878899876977899996545678975459878954599987654434569654598769999459995
    4345998789764569897999699767899989967987988949876434989986969767895678998763123678967987658954356789
    5656799893212698975778987656787896459898999235986545795499899656987789349874564989989996547893235889
    6767899965435987654569876544656789598769210124598678894298798746899893298765678991095987656792023979
    9898999876786986543210987632347899987654321235698789965987653234901910129886799543234599767893434568
""".trimIndent()

val day8_test = "acedgfb cdfbe gcdfa fbcad dab cefabd cdfgeb eafb cagedb ab | cdfeb fcadb cdfeb cdbaf"
val day8_input = """
    gbdfcae ebcg cfg gc facegb fecab acfge cbfgda fedag caebfd | ecbg bfcagd faegc gcf
    eacgf efcab fgc fedagc gdeaf cged aebfgd adcgfbe gc bdgcaf | fgbacd cfega ecdg cg
    dfgae gcadef efb eb dcabf bgde edfba bcfaeg egcdfab fbgade | bged eafdb eb gfdea
    aefdb cafdgeb egdfac egdcba fcbd efd eadcb caefbd df aegbf | cfadeg abfedgc fde bfcd
    dc deafg ecd dbaefc adcfeg cfged ecbfg acdg cafdegb gfeadb | dcga edc adfebcg ecgfb
    befdc bcfge befad degfab cde aecbfd gcedaf eafcgdb dc bcad | bdeafc cde ebdcafg daebgcf
    cd egdacfb fdc fecgb gabdf fbcdg fcgdeb gdcfea debc ecfbga | gfecb fbgecd bcgef dc
    fagcdbe gec gbdea ce bgedc aecd cgbeaf cfbdg gebcda dbfgae | cfbaged cgbeaf ceg gadfbe
    gcbaf gfdb bdafc df adf adcbefg dcfeag cebad adfgcb faecgb | afd agfedc dcbfa gdfabc
    fbae cef fecdbg afbcg cefbga fe acdfgb gadce fbdacge fcage | fe abef gfbac cef
    cfdebg bg beg cabfeg fbgd acged ecgbd fdcbe cfbeda cebgadf | fbedc gadce gdaec bcfed
    gba ab fgbcd gedaf bcadge afbdgc cdgfbe agdfcbe bcfa bdfga | gab gdbfc ba fgdbcae
    fabdgce bfdgac cbaed dcb bgade fbaec fcde edbfac gfabec cd | dc cefd dc cd
    afc dbecafg fagce fbega fbgc edgca agecbf bafged eacdfb cf | cf bfdcaeg gfbc gfbc
    gedcb ebda cgbdfa fcaeg gab bfgdce ba agbce bdgecfa dgebca | bdgfce cebagd cbdgfae dcfbeg
    egbacf acdfe gfecb egdfcb dfgaceb dfb dgcb fdbce db bdeafg | fdb db db bdf
    cfeg eabcf gdefcab bef geabc bfcad egbadf cfgbae egcdba fe | fgec gaecfdb cagbef ef
    bafde dbgeac feacgbd cbaef bed bfgaed gafecd bgdf bd eafgd | db cfgdae caegdfb fabed
    afg bacg cdbgf gcdfab fdcae gafdeb dbgfce ga dcafg cedabfg | gaf bdafgc agbc ga
    edgca bafdcg acbdg cbdeag dce fgcea gdcfeb aebd ed gfdabce | ebgcad daeb edcga ced
    agecf abfegc dbefcga ad dafc fegdb adg afgde bdcega ecagdf | fadeg dfac dga da
    ceagdb gedac acfdbg cda bgecafd adgeb dcefg ca beac abgfde | aegbd baegd bdcagf abcdeg
    egaf bagdce dcgabf ea eab cgbfa cdfebga fbcae dfcbe fgbace | gdfaceb gfea dbcfe eba
    cfbega bge eg cgdebaf gedbc adeg bceadg bfadcg agbcd cdefb | ge ge cfedb fbgadec
    afc ca cabe gbefcd aebcgdf acedf gbafdc eagfd edcfab dfbce | gbfdcea fca aecbfd ceba
    af bcdag agbfde fdbca ebdfc adf dbefcga abedfc aefc dbgcfe | af acfe adf adcfbe
    badfe agebd gfaced gbdcafe aecfd fab dbfc geacbf adbcfe bf | fb ebagfc beadf dface
    bfeda gabefd agbedc ec fcadeb dfbaecg cea fdec afceb agfcb | fbcae cfde eac fedc
    ebcf eafgcb egdfba dfcag bacge faceg afe gdceab ef dgcbaef | fcbe febc bcaeg cbfe
    dafbc afdebg egfc ce eagbcd ceafgbd fgeba cbefa eac fcgeba | afegb cdagbe cbdaf gfaeb
    ecd dface cdgafe gcabfd edbgcfa gdacf fecg cdbaeg ec efbad | edbaf gcafd dcgbaf dafgceb
    gd fagbec bdfg gde cfgbe cefdbg gbdeacf agdcef bdceg bcdea | dg gcfeba dg ebdcg
    bg bgdeac abdg cgb fcbade gdbceaf fbdgce dbeca gaebc aegfc | cgb befgdc fedgcb gbc
    gac cgeda egcbafd gfdbce fadec ag degbca agecbf dagb gebcd | cdegb degcbaf cedaf edafc
    ecfab bfacdg bdga gb cfgba bfg gefdacb cegdfb fagdc cafedg | bfg cefba gb aedbcgf
    dgfce aeg cfbdgae acfgeb ebcafd ag gafed gaebfd bdga dbfea | gae cfbdae abedfg bgfdae
    cgbad cbaf fbgeda dfgcab fdcebg dbfcg decag cdagbfe bga ab | dfcabg cbfa fcedgab adfcbeg
    cegbadf edfgba cafeg dc agdebc dbgfe cdbefg dec dbcf edfcg | bdfc facdegb adfegb egbfd
    bedf cefadg ced ed bcegd gefabc agcdbfe cdgab gcfbe fgcdbe | ed cde bdgec dbecfg
    egfcab debfa ecd bfgec cdgb cd bdcef dgebcf ecdabgf egcadf | becfd cbgd gcdb fcbed
    bc dbfge gbecf caefdg gefabc abgdcf bfc baec efcag cebgafd | baec fegbc agfec cgbef
    bacegfd fbdgca egbcf fabce bdaefc dcaef dagefc ba dbae cab | daeb cbefa cab ab
    fgab cgdfae fcgebd gb bcg dbaegcf cabed gadcb gcafd gbfadc | gbc adcgf dgecbf cgb
    gdaeb df cgaebdf dfbe cbdagf eabdcg gfd aecgf aefdgb agedf | dfg gfcea febd ebdag
    ecbaf cagfdb aecgf gac ebga defagcb baedfc gfcde ag gfbeca | cadbfg gaecbf agbfec fecba
    edbgaf fbd egdbfca dagf gabde bdfge fd bgcfe efbcda eacdbg | fbd ebcdaf dbgaefc gefbda
    acdbg aefcdg cdg cegb acebfd abgdf cg fbegadc gcbdae eabdc | gc edafbcg gadbc cg
    fgcd bgdafe bacge dg facgde acfde agdec gdefbca deg aebcfd | gd eagdc ged ged
    egfa efdcba dfbgc cbfea ga abcfg edgcab bga fecgdab aebfcg | bga faegcbd bfeadc badcge
    bfeda ceagdb bf ebfacd edacb acefbdg begcdf bafc agfde feb | fb fb fbac bcegad
    bfdcea dcbgaf cbega dbage cea ce cbafg gefc bgacfed bfecag | abgfc ec cegf acdefb
    adgfce cdag cd fgecab cfgae ced fdbae gebdfc agbcefd ecafd | dfcae dc fdcae ebafcg
    dbeag begfad bfdegac dcb cb gcfda ecdgfb ceab gcabd dcebag | cbd cb cegbda bgcdef
    cdfaeb fgebad ea dcbgfa gcaebdf cegbd bdcae fabcd cfae eba | caef bafdce afec gfdbea
    bcfega gcbea bdfgeca gabcd bd gdcabe dafcg ecdb dba ebfadg | fceadbg fbaceg db bd
    gadcbe dgb debcaf fabgcd bcgfe bdgcf acfedbg gd cafdb gdaf | eafdcb bcfade badceg bdacfg
    gafce cabde cdf aefbdgc efacgd fgeacb ceafd df efgd badfgc | edfg acbegf dfc gedf
    afgce gbdecf bae adebcgf bgedca abecg abcd baefgd ba gbdec | ab dfagcbe gbeca ab
    de dcgaf gcfbed gdebfca acegb cde bcgafe abed gdacbe gecda | ed afgcedb deagc gcdaf
    gcdef ebfadc da dabefg daf fbaeg gaefcb dfeag gbdfcea bgad | gadfbe bafgce dgba afd
    bdfeg gecf fc egdfcb gcbedaf bfc dfcbe cbdfga baced abedfg | fcge fgdecb dcgfabe fgdeb
    bdf acbdfg bdaefg aefgbc abcde dagebfc fd dfcg cabdf cgfab | bfadc cabfg gfcdab fbaegc
    af cdfbega edbfac dfbgc fac adef adecb becagd acdfb efcbga | bcagfde bdfcae gfdecab eacbd
    egfcad bdgeac fdac fed cdage fd gcbfed baegf gfedcab gedfa | adceg fd afebg egdca
    fegba ecbafgd cfegba cgdab efbgad ec fadcge ecg bcef cegba | bgadc ce fecgdba baceg
    bdfaeg abgedc efadg bafd gfeba fcdebga adg aecgbf da ecfdg | ad ad dfba befcgad
    efadcg dacfb cfgab bfde eafdc decfbag decbfa bd bcd acebgd | debf cafde gcdafe fcgebad
    agd cgadef gcdebfa gd facge bdfgea eagbfc dcgaf cafdb ecdg | cbgfae ebfcga agcef bfdeag
    dfbge abefgd aefbcg dcfegb ba fgbad gedafbc bdea fba dcafg | agfdb fab fba fcbgde
    fcdab agbecd eacgfb gc fgeabd gdabc dgbea cbfdeag cag dceg | fcadb fbcad degba gca
    eag cbefg dfeagbc cdfbga egcba dcegba dace agedbf ae gadbc | cegba age agbdc dbcafg
    cdbag gfb dgceba cbfa gfdbac faebcgd deafg dgbaf fbegcd bf | eagdf febgcd fbdag gdfbce
    cdbgf afcebg acfdbe ed ced bdefagc dcgbea fbeac cbdfe adef | cfbde de dec ecd
    dfc fbcde dfcbga ecbgd egbdca fd eabfc edbfgc efdg cdfegab | df dgef fgbaedc df
    fcg egcbd gacefb dfgbc abfcgde bfdga cfed cf gdebac gbecdf | bfdcg fgc fbcdg agdbf
    fcabg acfbedg bfcgde ecbad agef ecfgba ecf fe dafbgc baecf | aegfbc cfe dbace fec
    edbagc cefbda bfdeg af agcf gfebdca fgdcab dgcba baf fabdg | bcadef dfgcab abdcfe gedfb
    acegf efbgcd dgbefac cgd bedga cbad agcedb dc egadc feagdb | badcgef cd dcgbfae cd
    bfc cdafeb bcega gdcf afgdbe egbfd caebfdg gcefb cf debcgf | gcebf bgedf dfbgea fc
    dgfaceb gcdf dabcg fd dfgba aefcbd bdacge gfabe afd dcagbf | daecgfb gbecda dacbfe gdcba
    fbgedc bfcda cfg dafbge fecdbag cagfd aecg agfde cg adgcfe | ecdfagb gfceda gaebdf gbfdea
    afbe gfa gfdcb af febcadg faegcb bcgea aedcbg eagfcd afgcb | bagcf gfdeca abfe af
    caefg efd fd abedc fcgd egdcaf egafbd gfcbea dafec abgedcf | gaebcf fcedga def egcafbd
    dcfab gefdcb bda da baefc baedcfg gfda dbceag cbfagd fbgdc | cdebga efdgbc fbcgead beafc
    bgfed fdaegcb bedagc da bdacfg gda eacfgb cadf dafgb cabgf | dgceab da dfbeg bcegad
    cedab fc adbfec faegcb adbgf cfa ecdf ebagcfd dcbfa ecgabd | becdaf cefd abdfc efcd
    cdgbea aeg agdec dafgbc gbed aegbcf ge aecfbgd cagbd cafde | ceafd bagcd gacdb cgbad
    dgfeb bedag cgdefa df gfdaeb cbdega gfdceba gbfec dafb gfd | fabecdg bdfa bdaf dfba
    gdfe acdbf ed bdegcf cegbfa cebfd deb badegfc fbcge bgaced | ebd efgcabd bfcda dfeg
    abfcedg gec fcgdbe gaebc gebfac efbdca gfea acbfe gbdca ge | agfe cge cdbgfe bcfdea
    fgbaed dacegb dacef egafd aecbgf adfcebg bdfg ged agfbe gd | agdfceb gd dg fbgd
    egdb acgbef edfac bd fgecb gbadfec bcafgd bcd bedcf gdecbf | bdc bedg gdbe efbgc
    cagbef acgbf fgcabde cgd gbda dg dbfgec ecafd dgfca dagbcf | agbcfe dcgfa dbagcf cgdafeb
    cb efbgc cgfae cgb gceafd beca fbcgae gefdb cbgadf dcfabeg | bgeacf bacedfg cbdgfa dfgbe
    cgbedf facgdb agfdc cga cafed gfcbd gcdbeaf degacb fbag ag | gbaf acfed gafcd cgfda
    egbdfca cadf bdafgc cbgfea cbgde bdcfg gfc cf fdbag gebdfa | eacdgfb fcda dfac adefcgb
    fdgea abcd ac cfabge cdbfeg gdebac acg gcdebaf gadce bcedg | gac abefgc ac gcaed
    eafdc eafbc agbe begcadf ba gcefba fgcbda gdbfce cba ecbgf | ba ab abeg adcgbf
    afg ga bdafe eadfg dagc gefcab edbcgf ceagfd ecgdf aedcbfg | agdc daefb debcafg fdaeb
    baf cbdgf afbecd gdcabfe dcfabg fadeg gbac gbadf ab cedgbf | fcdeba cbga afbdg bgca
    ebdfgca ebfdag gb bgf fdeagc gdbe cdfgba egfab abcef agdfe | gb gfbdea gdeb eafbg
    agbcdf fe gebad fea becf ecfbga cgabf aegfb fedgca acgbedf | ebgda ebdgacf fcbe aef
    gdbef bgfadec gfeab eab gdcfbe ab bfadeg fdab dcaebg acgfe | fgadbe fbedgc dgefb aeb
    adcbf fbdg bcf dcbag fecad cgafbd fb acdefgb bgefac dgcabe | dfcab cfb bf cdeaf
    dfgbca cdebagf cfe fcbga aefdg geafc bdecgf ce bgefac aceb | bace aebc gfbac efc
    adfegcb gcbaf fa adgcb acf efgacb fgcbed eadfbc agef fbgce | aefg acf gafe cfa
    fdegbc fcbad ec ebgaf gecfdba feacb caefgb degfba ecb geac | ecb ecb cfadb ebafc
    fegabc ebcgafd gfacde ge fcgeb ceg bagcf dcfbe ebga bdcfga | cefabdg fdceb abgcf gfeadc
    fdabcg bgafc fcbeag edbfg gadfceb ad adb dfca dcbgae dfabg | bdegf faedbcg da caegfbd
    cgfae gdbeca decaf fd dfbc fad dabegf daebc bedafgc efbcda | decfa fgcbdae fcbead dbegcaf
    dbeaf cb fabecdg bcfda gabfdc cbfg agdfce abc edgcba cgadf | bcdefag bcgf dafbc badcgf
    gbdcfa becfdg fdbcgea fgc cg fecdg efdgb ecadf gceb gadefb | gcbe fgcebda daecgbf aebcfgd
    cdega dgcaeb cbgea egdcaf gfacedb begfda cebfg cbda bag ba | ab egdac beafdcg faegcdb
    gab cgfab cfage fbaedc bcdg gb gacfbd defcagb gdebaf fadbc | bg fbacde gfabc dceagbf
    ge ebg cgdfb cedba bedgc ecag deagcb bfceda gdcfeab egdbfa | bge beg bafged cadbeg
    eabd ebacf ecd fdcbg dbafegc ed ceagdf fgceab ecfbda cdbef | dec dfcabe dec befca
    afbgdec cedb dc agdbf cegbf bfcedg cdg bdgfc baecgf ecfdag | cd dgefbc fdgcb cd
    gebdaf dgfae afe gafcbed agcfd febd edabg gbfeca bcdega fe | ebdag fedb egafd aegcbf
    gebdcf abefdcg deg bgdfc fcde gbfea gedabc edbgf ed bgfcda | efdbg fedacbg gbfacd fbdeg
    bcgd edagc gaebd bcdaeg fabedc bgefa fcadge agbfcde db adb | cgbdfae bdagcef badegc dab
    df fdb bfadceg bgeadf afbdce efdg dgbae dafbg cafbg abdgec | gdfe afcgb ebcgafd fbgacde
    gabce gdfaeb bcad cebdgfa fgcbae efgcd dga da cgdea cdeabg | ad agd gda gfedc
    fcabge edbfg fcaebd ea dcbagef gace gafcdb bafcg eaf fgbea | dcfbage aceg afbdceg ebcafd
    bafe egfcda be bfgaec gbe egcfbad fcaeg bdcaeg bgecf cfbdg | fabgced bfea gbcef gcfeb
    badfeg fgecb af cgaebd acfdbge gaf afcged gfaeb dfab egbad | fa fga abfd gabde
    afceg bcdfge fcaebg baegdcf cfg eabcdg bgfa efcad gcabe fg | abfg gf fbgecd acebgd
    acbedgf fb efgdc bgf gbcfd bgfdac dagcb fdbeag ebcdga fcab | bf gdebaf fb bf
    aecf cgbdefa bacged efbcga fdgcab febag af agf dgfeb ecabg | bcgdaf af cadfbge efca
    egfda fgceab acd bfcadeg dc dcega bfdcea gcdb cdbega eacbg | gabecd cd befgcad gdcb
    gecda dfegacb cgfae cdbfag fcbeag afg gf fbge dafecb caebf | dfaebc cfeab gf agdfbc
    gdafe cdgaeb egfdba da bfdgec gbfed eagcf egdbafc fbad dag | agfde dga dcgbfe abcdfeg
    acgdb gadfce cbefdga becad bcegdf bacgdf afbg ga dag dbcgf | abdgc gdeacf acdfbg ecdab
    gdfa eadbc gcafe dgc dg fcagde bcgfea decgfb egcda fbecagd | cegda cgdea gd dg
    ga egdbcfa aegcb cag egbcd gadceb gbcefd decafg badg cabfe | bagd cagfed gacdfeb cbegd
    cb deafc bcgd agfceb dbfega ecb deacb aebgd cbafdge ebdacg | dcgb adceb edgba ceb
    edgfab acgb becfdag bgf cgbdf cgfad dacbfg bg ecdbf afegdc | gfb bg gcfade gfbdeac
    caebg cgaf acgdfbe begcaf cf fdgeb agedcb ebgfc cfe fbcdea | dbfeagc cfe fbeagdc cf
    ageb bg adcbfge fcgea cbgaef cbdfa gfb fedacg bfgca fdcgeb | fbg afdcb ecgbdfa cgfdbe
    dgbfe aeg ea dcea dbeagfc fbacgd ecbdag gadbc bcafge adgbe | aedc ae gbdef daec
    dbafcg dbgaefc adfc egdab fdg df agefbc bdgcfe fbacg gdfba | bedgacf gcbaef cdfgab cafd
    eg fdgcabe gcadbe aebdc gced bagfde gea gbeac afbcg ecdbaf | agfbc fgdabe fcdgaeb feabcd
    fedb gfe defabgc caedg cgadbf feagd bdagfe fgbda efagbc ef | fe fgcbea ef dbfe
    bc agcb dfceg bafgdc gfabd fbdcg bcd ecgfbda ebadgf fbaedc | cbd fabcgd cgbfd bc
    ebfgc dbeg ed gefdc cde gfbecd fgdca caedfb gdbafec gefcab | fgdecb dgfce fbecg cabgfe
    ab ebda bfagdc becgd aecfg bag daecgb ebcag gbacdfe cfgbde | abedgc eafgc ebacg ab
    ecdbag dagbfe badef fcaed adc cd efbagdc cafge cfaebd dfbc | dcfb dca acd gcdabe
    cedbgaf ecbfg dagfec dgbea bdca gfdaeb ecgbd dbecga cd edc | ecbdga cde edbag dc
    egbfcd gbcafe ed defga dbgfa bcgdeaf cdea def eacdgf gacfe | bgfad ecda gbfad gcdefb
    dafge cea fdace agdc dbgfea ebdfgca dcbfe acedfg abecfg ca | defac gcad ac ca
    ecdba fbac eabcdf beadgfc acd efacgd ac agedbf bfdea ecgbd | aecbd agbefd bdgec dgebc
    bfegda bdage gdf gfdae bdfgace fgeb afdec fgdacb gf deagcb | fbaegcd fegb aedgb dfg
    cdaf fd bcdfge agebf dcgfae gfead baedcg gdcea egdbacf dgf | efgab df eagfd afgbe
    egfca egcb ceafdb fbc fbcaeg dgbfa cdfeagb fgcba agdcef cb | cb gcdfae eabgfc fgbca
    gdbca fdecba gdecfb feagbd ceb adfbgec bdgec ec efgdb cfge | ec ecbgd dacefb abfged
    edbcag cabd ecfdgb aegfd eagfcbd ac cga feagcb ebdgc dgeca | acfbdeg dfgea cga dgeca
    ebgacf adcf bcgedfa gdcabe abedf aef edabc fa befgd bfdaec | aefdb af cebad fae
    dageb de gde dgfbce cgdba gabefd afbge cgdebfa aefd ceafbg | efgbda agbdecf bfaegcd edg
    ce dec becf efdgb edfgcb ecbdag gdaefb beafgdc dagfc fecgd | ce fdbage gcdfeba gbcadef
    ecgfa ebadcf ed gcdfab cdefa gfdaeb dbec dbfgace cdbfa dfe | dceb cdfab ed ceagf
    cadg efgcdb gbcfad feabc agfcb afcdgbe dgbfa gcb fagbde gc | gdecbf adfgbc fbcgade gafbc
    gdcefa gefdb bcfeg eabc fagdbc ecagf bcf afcebg cb bfgaedc | fcgdba agbecf fcgeba fgdceab
    afgbc be cbeaf gfeb ebcdfag cfdbag cdfae cfegba cbeagd abe | gdecbaf cagfb bfgaec cabfdge
    eb egdb dcagb abe gcdabe agbce dgabcf fedbca fdcebag gfeca | gdbe agdcb gfcae cgadbf
    dbagc bcaedfg gade cadeb efgabc cabedg gca fgdbc ecafdb ag | dage cagdb dgcaeb cdgab
    gbecd eacdg cgb egacdbf gfdbec efbg bfced bg bdfcea bafgdc | acbfde bg gb gb
    fgbadc fbdag dbecg fbae dacgef ega ae afcbged ebgfad bgaed | ae bacfgd bfea agdbef
    dacfeg gecfd ad gadbfe gadbfec gda acde fcedgb acbfg fdcag | gefcd cdegf agd ad
    caegbd cfdeba edbac cfbegad fe fbea fdagc cef acdef bedgcf | ef cdafgeb fce edfca
    dgcae cedbfag facbdg fdc eacdbf bfegda dfcae fdbae cf cfeb | cf febgcda dfc cdf
    edfag dbeacg dbecafg agc gcefa gc bcfea cdfg fbdgae gefadc | dfacge fagbecd feacbdg bfaged
    abefdg fgdec ecadf efcdab ac dbeaf acdb acf cdegfab gecbfa | fca fdbega decaf cgafdeb
    bceafd fegcad edcagbf dbcage decba bafd df fcd bcfge cbfed | ebgfc eacbdf gadebc df
    egba cgdafbe begfc gacdfb dceaf cefbdg gfa ag gcebaf aecfg | acbgfd gabe fbgeac agfec
    cdgeb fdecag agdbefc gefbac cdaf ade fegdab cgead ad caefg | ecbgdaf dgceb cfgae dea
    cafbde fbgac edcg agdfeb eg dacgef fgcea aefdc dceagfb eag | afgec fbcga ceafgd bgceadf
    cefbg ceabd gd edbacgf aedfbc gaedcb cdbeg abfdcg gdc gead | cgd dgea gd cebad
    fadbg dagecf fea fbecga adce ae bedfcg egacbdf fdgec fdage | dcae caed dbefcg adgfb
    acged aec efgdcb ac fagc abdge abfdegc fdeacg cfaedb gedfc | egbcafd gaefcdb cae cagdfe
    fcbdage bafgec cab fcbae ac abdegf dbfec fbgae eagc cbfadg | acb dafegb acb bfeagdc
    af egfda gebdf gebdfa aefcdbg fbecda fgba daf cdeag dgbcfe | eagdc cefbgda daf daf
    dgebcf gcf agcbd fbecd fbcdg ebacgf aebfcd fdeg fegdabc fg | dacgb dfge fcdbe gedf
    bfacdg gafcb gefbd cd dgcfb dagc bdfagec bceadf fagceb bdc | begfd gbdfe afgcdbe fbeacgd
    bagf afe bdcaeg fdcbe af dafbe cbedgaf gfebad gdaeb aefcdg | baedcgf fa af cgadbef
    acdgf becgfa acd cagbf agcdbe fdba da bdcfag gfdec dcgafeb | bagfc da dca fdbacg
    cdabfe adbfc ecbaf cdae cdbfge dabgfc bfgae bec ce gadcbef | faecbd beadcfg dcae cgfedab
    bceag agd aced gdbafce bcfgae agdeb ad fabdcg fdbge egcbad | gaceb agd bdagec da
    cag dfgbeac ecdbgf ag gfabc ebag fabgec deafgc adcfb fcegb | dgaecf aebg bgea dcbfa
    afdb degbc agedcf da aed beacfg dgfecba efcab bdface cbdea | fbeca aecbd gdecaf ade
    cafebg afedcb gfeabcd fgcb cfa afdeg fc ecgab dacebg cfeag | bcgf bgcae gdfea bgcf
    feg gfcaed cfabdge gf degafb fdegc edfcab edgbc agcf cfade | gf gf gacf egf
    ceadf ecdgf eacbd cebagd dcabfge eaf fdceab fbad fgebca af | cefadb cefad bfad abedc
    gefabd cabdfeg dgceab dagef bdfacg egfdc edgab af feba fda | geadcb dagfceb fda af
    dfcea adgce dfebc gecfdba fadgbe dcefga cfga aebcdg efa fa | fa fae af gaedbf
    agbfd acbgedf faecb cegbad dgabfe gbc fcdg cfagb gc afdbgc | cg cg dfgbae cdfg
    efg bfacg feab efcagd fe bcagedf edgbc ebgcf afbegc bcfgda | dgecfa ef fgcba efba
    aebfdc bcfage dgbacf gface gbaecfd dfgce geab acfbg ea eac | cabfg ea cfagb eagb
    gba gdcea cdbfg acgdb gbecadf bfgecd dgcfab abfc ba fdeagb | ab febagdc dfgbac fdagcb
    dfcb gcebd dfgaec efdgc eagcb dfaebg afedcbg gbd gbcfde bd | gadebfc db febdga bgd
    eabd adcbg ceafg ecb be eacdbg acegb gbfcde adgcbf ecfdgba | cgfebad cbe ebacg dfgceb
    cefbgd cgdfa bagfced dabe fgceab abfeg gdbaef gbfad db gdb | aefdgb bd abdfegc fgabed
""".trimIndent()
val day7_test = "16,1,2,0,4,2,7,1,2,14"
val day7_input = "1101,1,29,67,1102,0,1,65,1008,65,35,66,1005,66,28,1,67,65,20,4,0,1001,65,1,65,1106,0,8,99,35,67,101,99,105,32,110,39,101,115,116,32,112,97,115,32,117,110,101,32,105,110,116,99,111,100,101,32,112,114,111,103,114,97,109,10,616,0,1633,1048,833,967,161,22,823,601,603,538,340,798,1053,400,54,41,54,296,1336,1013,9,763,650,313,15,177,1289,307,741,314,289,63,183,503,764,187,225,596,273,387,1,1165,61,19,78,514,355,605,103,483,291,1781,1137,398,593,38,444,204,274,528,147,131,1021,812,430,710,257,1408,1587,517,773,218,99,357,301,543,1668,11,311,350,373,145,507,325,1006,696,607,281,433,302,148,519,846,1528,766,158,51,850,216,1320,690,338,298,631,560,306,5,888,242,1230,1694,1330,570,184,946,97,96,272,537,312,1246,847,138,325,28,253,785,483,906,412,28,178,485,828,823,1035,1001,108,1068,90,308,223,18,191,1269,39,238,307,7,643,1546,203,254,371,402,207,666,786,793,361,441,105,15,421,1748,255,152,1376,626,296,707,4,627,885,49,316,34,379,1591,39,1087,135,1515,69,725,419,924,414,78,1169,8,1331,2,771,1295,570,323,9,406,75,42,1003,180,188,174,145,128,625,1312,85,427,56,15,87,449,831,906,34,186,609,1597,531,104,1034,615,608,1338,192,280,982,334,853,1155,194,124,205,1384,135,906,239,761,1357,16,328,623,3,1432,634,1698,31,981,347,75,222,896,77,1204,1272,711,106,772,1366,279,162,98,487,1281,188,71,307,398,470,40,12,459,449,984,1271,260,1132,493,1117,129,36,1040,947,570,89,853,373,102,771,107,266,106,59,485,61,87,353,164,278,1489,542,442,4,62,788,63,130,723,919,1169,327,459,431,1107,992,1162,1287,901,838,638,261,307,761,533,119,336,4,422,173,172,64,222,531,998,1250,1007,20,1231,69,289,531,757,185,519,184,1139,369,2,1102,857,339,1267,1357,217,774,1352,23,136,2,1389,253,87,883,28,247,292,15,332,69,170,20,544,75,850,310,1137,301,155,265,100,842,189,7,584,40,168,22,548,7,30,1027,744,1294,329,100,1255,424,515,460,163,375,26,618,275,1012,935,160,181,84,186,990,1208,152,753,508,590,578,81,625,600,430,306,311,156,5,56,187,25,249,1090,316,224,173,199,71,221,1219,335,87,260,607,121,25,1326,473,224,92,87,734,179,64,325,320,117,302,1247,879,716,984,284,239,738,30,90,61,844,997,823,387,956,842,580,540,648,1947,32,63,380,873,1086,142,512,206,742,584,157,858,1300,992,311,139,906,693,1,36,1320,236,48,58,32,147,34,229,497,1,657,616,309,494,1419,264,595,729,1374,984,74,446,436,77,1516,156,915,565,159,269,263,442,775,12,6,337,115,971,598,87,1283,533,991,204,1382,1204,277,27,801,260,198,426,89,72,458,1164,571,1329,501,1547,125,376,865,642,268,626,167,429,901,623,103,100,1064,125,450,695,28,1470,469,187,119,1363,44,485,1243,1163,507,139,147,72,100,160,624,506,1360,66,444,581,729,531,701,1091,178,476,22,926,354,88,1076,946,213,38,43,125,291,714,113,54,1214,1067,641,374,411,64,1364,415,133,752,372,212,19,1941,780,902,512,852,157,8,175,90,913,125,771,764,381,947,572,391,313,249,201,106,1500,487,107,868,464,984,1471,550,642,196,571,18,306,293,659,1274,290,352,0,528,754,564,316,685,57,293,75,584,251,1107,217,11,21,329,493,175,600,259,380,30,148,556,136,180,12,26,507,199,3,0,143,87,1452,359,989,170,64,269,17,1018,105,317,289,127,275,269,359,511,690,205,423,356,19,177,260,789,51,119,210,1151,707,869,194,773,159,216,759,16,161,47,1254,293,54,504,432,1230,213,26,253,424,98,1515,162,346,326,12,122,79,210,912,55,705,597,369,1381,284,1163,316,34,384,36,1254,1455,994,60,1395,476,100,38,726,198,605,103,489,361,9,24,158,1056,264,1103,175,1423,266,45,93,271,331,673,788,48,12,580,697,593,480,268,559,302,87,281,6,401,170,90,939,543,223,137,809,139,182,571,68,1112,20,1004,1090,249,1435,267,10,375,504,906,946,1503,1362,184,233,112,1058,16,235,548,563,162,102,746,439,105,259,27,19,817,1444,119,175,341,130,202,31,432,480,710,1127,682,454,134,823,168,276,113,914,1112,118,10,1041,902,141,1428,282,485,353,589,906,987,488,144,154,25,930,368,261,176,168,85,814,1915,248,49,1012,3,143,951,30,411,336,46,1383,26,857,1650,192,1477,194,73,154,91,287,229,144,675,989,135,360,74,60,223,219,625,182,793"

val day6_test = "3,4,3,1,2"
val day6_input = "1,1,1,1,1,1,1,4,1,2,1,1,4,1,1,1,5,1,1,1,1,1,1,1,1,1,1,1,1,5,1,1,1,1,3,1,1,2,1,2,1,3,3,4,1,4,1,1,3,1,1,5,1,1,1,1,4,1,1,5,1,1,1,4,1,5,1,1,1,3,1,1,5,3,1,1,1,1,1,4,1,1,1,1,1,2,4,1,1,1,1,4,1,2,2,1,1,1,3,1,2,5,1,4,1,1,1,3,1,1,4,1,1,1,1,1,1,1,4,1,1,4,1,1,1,1,1,1,1,2,1,1,5,1,1,1,4,1,1,5,1,1,5,3,3,5,3,1,1,1,4,1,1,1,1,1,1,5,3,1,2,1,1,1,4,1,3,1,5,1,1,2,1,1,1,1,1,5,1,1,1,1,1,2,1,1,1,1,4,3,2,1,2,4,1,3,1,5,1,2,1,4,1,1,1,1,1,3,1,4,1,1,1,1,3,1,3,3,1,4,3,4,1,1,1,1,5,1,3,3,2,5,3,1,1,3,1,3,1,1,1,1,4,1,1,1,1,3,1,5,1,1,1,4,4,1,1,5,5,2,4,5,1,1,1,1,5,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,5,1,1,1,1,1,1,3,1,1,2,1,1"

val day4_draw =
    "25,8,32,53,22,94,55,80,33,4,63,14,60,95,31,89,30,5,47,66,84,70,17,74,99,82,21,35,64,2,76,9,90,56,78,28,51,86,49,98,29,96,23,58,52,75,41,50,13,72,92,83,62,37,18,11,34,71,91,85,27,12,24,73,7,77,10,93,15,61,3,46,16,97,1,57,65,40,0,48,69,6,20,68,19,45,42,79,88,44,26,38,36,54,81,59,43,87,39,67"
val day4_bingoCard =
    "25,83,15,27,22;97,81,12,80,52;65,58,91,23,36;77,60,49,43,95;13,21,56,78,99#43,85,82,52,40;19,14,91,4,7;6,87,64,26,56;94,58,81,98,90;18,72,23,37,20#5,43,13,47,93;25,78,64,56,10;75,90,50,72,14;9,29,58,79,62;69,66,88,35,16#73,13,35,91,24;66,37,39,88,7;55,36,41,81,85;29,49,70,4,23;98,69,84,56,87#30,44,76,87,57;67,24,63,38,99;41,69,35,60,78;32,6,88,9,55;46,75,77,13,22#29,68,51,92,64;50,65,86,22,98;66,6,44,53,87;54,63,25,59,14;96,52,90,58,71#68,73,79,50,98;10,94,53,46,88;59,78,35,71,15;42,67,82,17,92;40,1,83,61,16#44,64,97,63,93;32,84,55,70,24;29,67,68,86,18;90,72,42,21,88;53,40,85,27,11#45,31,6,30,3;66,16,73,65,25;48,41,98,27,55;39,17,19,8,24;85,2,28,63,13#86,3,20,41,53;98,45,63,74,47;87,68,97,13,42;58,73,48,35,17;91,38,55,4,34#13,44,26,77,23;51,88,41,42,93;12,56,38,87,73;60,19,55,99,21;3,34,20,94,32#26,72,39,21,76;94,12,1,49,60;38,20,30,48,98;53,62,22,92,69;7,88,57,81,13#99,20,70,52,12;23,28,45,66,41;92,8,55,22,36;14,78,9,46,18;21,87,89,27,68#76,92,45,53,98;56,91,72,19,35;25,59,42,90,68;47,97,30,65,95;94,60,52,36,54#9,18,39,89,29;25,84,37,72,28;17,70,27,93,0;80,36,74,35,71;11,49,57,46,4#37,66,54,93,77;40,95,94,34,11;35,64,92,16,43;9,6,83,32,29;2,80,10,45,72#37,95,70,62,1;58,14,38,22,63;44,7,78,34,39;73,50,26,0,52;60,69,87,27,97#10,9,83,11,5;33,62,18,75,47;3,86,36,26,91;39,80,14,67,15;74,95,88,37,57#7,83,44,24,66;67,60,51,52,46;27,77,35,72,88;22,69,1,78,64;41,58,81,21,3#68,34,11,40,17;15,43,9,64,49;32,37,20,14,81;3,87,72,16,51;25,77,58,10,52#89,61,97,14,56;32,90,98,69,4;88,58,51,76,66;15,62,35,7,29;95,8,33,73,22#25,59,40,71,8;36,42,47,67,19;93,50,80,98,79;72,97,68,81,39;56,91,12,95,53#65,90,44,88,66;43,23,35,18,77;9,97,16,38,22;81,49,39,10,41;36,56,13,29,37#53,32,6,41,8;4,38,88,29,37;58,54,15,83,12;13,1,98,85,23;69,49,26,64,70#66,33,15,7,77;26,16,79,28,58;69,96,14,44,61;43,75,0,97,36;59,41,22,24,87#90,54,4,62,63;2,79,59,6,82;53,74,65,86,75;71,32,13,80,10;17,0,20,69,50#60,3,78,2,47;44,32,23,42,17;35,59,50,74,54;64,49,51,5,65;21,13,63,43,38#6,53,57,18,33;26,31,9,44,34;81,21,39,2,52;95,5,43,46,91;98,71,59,30,48#13,31,91,1,67;96,35,20,19,40;87,27,78,9,22;11,45,38,46,51;72,68,23,25,85#99,97,85,86,20;92,16,60,6,67;18,87,93,79,53;0,51,56,19,95;78,84,40,98,34#91,11,1,36,47;43,62,27,32,50;75,52,87,29,30;61,34,39,68,58;77,18,21,13,40#22,41,63,28,81;37,39,29,95,83;49,10,94,0,54;96,38,80,87,1;15,93,99,47,23#22,97,54,89,55;52,63,78,57,84;47,36,64,21,20;45,41,16,11,66;3,98,10,99,1#26,15,89,54,86;10,60,52,64,74;40,91,24,51,66;95,43,29,34,85;88,18,97,31,53#61,96,63,89,12;57,28,29,23,53;82,40,56,44,13;50,73,0,30,4;79,78,64,37,26#29,60,24,73,38;69,94,6,9,1;97,40,27,26,86;59,52,4,15,96;61,63,55,66,85#98,39,56,63,58;54,88,41,48,65;85,28,14,29,2;20,70,46,72,93;75,59,36,57,71#38,27,60,37,44;98,9,13,45,57;4,76,33,8,21;19,7,77,50,22;71,35,80,46,20#88,73,59,65,41;61,63,33,85,22;76,50,19,77,45;52,99,2,8,83;25,92,98,60,71#49,40,35,83,36;15,71,90,47,19;34,59,55,42,21;69,7,23,9,70;43,22,48,57,60#33,4,38,26,59;50,47,63,75,19;11,65,24,87,21;45,16,97,40,57;83,96,70,41,12#46,82,87,88,9;51,64,97,6,41;24,72,79,43,90;74,92,45,22,54;1,95,80,55,14#86,52,90,19,85;25,67,30,84,56;66,71,39,74,96;93,46,89,72,29;97,40,99,62,44#82,87,79,63,1;27,61,30,26,6;76,59,56,44,36;72,12,88,92,33;93,78,66,67,9#96,81,75,42,20;87,13,35,79,77;6,31,44,24,80;32,63,78,2,56;1,46,40,99,14#55,24,10,61,89;7,37,19,20,60;68,65,39,18,86;90,59,79,84,88;81,74,27,70,73#19,35,91,14,53;85,89,4,39,70;80,36,2,57,61;63,82,81,22,78;37,43,83,12,94#70,99,79,92,36;21,30,88,22,96;11,60,23,41,64;81,10,13,51,19;34,45,42,17,38#39,21,37,3,2;54,32,25,26,81;98,55,53,35,67;90,48,15,18,68;22,78,83,30,72#32,50,94,51,26;1,82,86,75,89;27,6,16,57,3;91,66,30,39,25;9,46,88,12,35#14,91,16,30,45;41,82,42,26,15;43,72,81,38,92;95,87,7,28,46;63,71,11,22,56#45,58,68,37,81;16,20,71,82,28;85,89,23,65,18;40,66,11,70,10;60,97,69,86,19#16,47,46,53,13;48,76,98,66,12;79,43,25,36,31;85,1,41,3,50;99,73,83,89,64#27,82,33,36,83;73,31,34,7,30;98,20,32,39,92;56,90,85,11,23;6,89,44,87,50#18,58,84,47,15;63,16,22,65,72;82,4,55,13,8;19,86,11,52,3;54,80,39,97,12#73,85,3,24,37;4,7,75,16,42;92,95,69,81,66;0,40,12,18,49;26,38,56,25,35#66,91,90,41,44;89,47,23,24,18;6,38,62,2,60;1,29,8,53,70;76,50,85,34,81#8,99,34,19,80;46,3,17,26,54;95,43,63,49,14;90,77,1,42,85;83,59,57,33,30#75,12,7,21,70;89,36,96,46,90;37,28,23,32,39;2,18,81,11,57;15,24,0,9,65#7,53,6,34,20;32,76,24,56,29;43,62,26,75,72;94,79,77,60,12;58,19,17,55,9#35,85,48,30,53;3,0,98,74,37;55,29,81,86,2;22,7,33,62,94;1,31,99,16,14#46,68,6,94,79;86,99,44,38,91;93,80,90,50,63;2,71,65,23,39;43,31,20,82,28#20,64,92,2,23;87,28,99,93,59;70,30,39,33,51;13,27,95,90,29;24,47,83,48,60#64,93,47,22,27;7,74,75,26,60;83,9,5,90,55;28,57,45,56,98;21,77,80,8,67#1,11,79,36,24;27,37,50,69,98;4,39,38,6,59;49,53,22,31,15;93,47,86,72,40#14,26,39,20,32;93,89,19,67,92;15,16,96,50,51;2,86,97,54,5;25,8,72,4,1#32,64,27,13,63;70,36,95,9,80;2,76,10,16,0;52,18,12,97,33;71,82,72,15,99#57,82,29,0,83;68,33,31,21,60;7,2,27,44,89;15,88,71,70,52;97,3,63,66,59#45,94,12,48,24;2,38,69,6,31;44,99,52,27,43;13,74,10,67,76;35,20,25,86,19#18,26,30,38,32;0,27,82,55,72;53,20,19,58,84;80,76,2,97,4;61,24,3,73,92#91,85,95,12,11;94,49,41,31,47;98,9,56,55,3;42,22,19,72,68;59,54,88,50,16#51,68,98,11,48;45,17,81,10,94;38,69,42,40,67;1,20,12,27,32;8,44,41,79,62#47,65,41,60,12;92,43,94,1,86;18,63,26,46,71;62,21,11,80,98;23,40,67,77,89#78,67,20,48,53;99,10,38,51,7;62,89,87,68,93;31,55,80,69,29;36,74,88,44,11#39,27,82,95,52;53,75,34,35,41;0,94,30,62,13;20,77,2,8,12;44,32,68,17,99#37,48,9,29,94;34,23,66,93,86;33,10,87,61,20;1,41,35,80,19;83,96,47,2,76#62,25,0,47,39;96,24,99,73,61;51,72,9,21,20;97,71,19,83,78;46,34,44,48,1#60,63,97,56,96;1,11,70,59,4;21,43,8,36,46;80,88,76,68,37;86,5,12,15,73#90,94,39,24,89;71,31,10,51,97;16,54,52,36,98;48,7,77,84,57;88,9,92,0,66#43,45,33,1,26;56,22,8,78,92;60,51,96,7,58;84,31,88,12,73;76,25,63,87,37#68,62,15,30,18;5,49,23,13,73;45,67,50,35,86;85,31,53,27,32;4,1,90,10,2#13,23,41,82,40;69,12,17,0,34;4,91,71,21,67;53,87,36,80,6;83,25,92,29,56#61,95,19,53,22;50,40,66,58,79;92,33,47,45,14;54,32,12,48,78;89,28,82,80,21#18,35,15,51,50;41,29,46,22,79;34,97,92,75,87;99,76,42,6,58;86,10,91,21,67#51,27,94,66,64;83,26,45,87,41;61,77,68,17,99;74,93,19,28,50;12,69,44,63,10#15,10,47,79,12;90,20,18,19,64;61,6,33,29,52;92,37,43,49,13;91,4,50,65,53#35,80,88,72,81;22,84,51,96,25;4,47,70,27,36;62,54,78,11,1;5,0,6,19,53#83,54,4,26,86;63,11,50,46,96;58,99,23,18,82;14,57,77,98,72;43,34,25,65,1#73,58,62,8,61;0,13,16,82,79;67,37,93,30,31;27,7,59,15,72;68,88,81,49,60#72,56,70,24,18;53,91,95,11,65;63,67,49,22,74;59,25,94,20,97;6,73,52,47,38#18,46,93,87,51;24,28,10,30,38;82,2,40,17,76;81,39,97,48,5;19,0,27,74,63#59,95,47,41,28;31,57,15,5,40;21,72,56,99,17;37,52,27,48,33;50,53,8,73,68#10,21,79,71,5;40,92,54,97,46;45,15,9,42,50;68,81,90,47,99;44,2,64,27,69#4,23,59,88,60;39,16,28,56,90;94,78,57,53,46;20,14,51,44,99;91,17,7,83,84#74,19,24,39,16;44,62,61,99,42;65,63,50,78,38;27,49,86,80,33;66,30,2,31,83#87,45,18,99,4;89,78,27,90,34;72,6,46,16,57;60,41,33,82,62;48,20,55,32,14#97,20,60,49,50;35,4,90,67,52;66,72,92,13,30;85,41,62,77,16;64,22,40,51,43#31,25,67,3,56;1,60,89,98,15;73,24,41,35,12;26,83,62,17,79;95,65,84,14,0#15,71,52,81,45;99,48,65,79,4;85,36,37,87,64;61,95,6,27,34;17,14,43,60,92#59,93,18,63,19;92,14,61,13,26;39,70,2,58,6;68,57,89,81,4;55,98,79,85,3"


val day5 = """
        223,805 -> 223,548
        609,164 -> 609,503
        461,552 -> 796,552
        207,361 -> 207,34
        503,879 -> 503,946
        937,52 -> 937,268
        560,652 -> 118,652
        771,103 -> 85,789
        119,156 -> 947,984
        356,634 -> 607,634
        348,812 -> 873,287
        409,490 -> 726,490
        298,790 -> 298,454
        407,543 -> 820,130
        206,89 -> 591,89
        164,709 -> 976,709
        208,921 -> 208,131
        515,209 -> 515,745
        876,639 -> 281,44
        270,453 -> 727,910
        190,417 -> 190,755
        522,726 -> 903,726
        390,651 -> 603,864
        707,549 -> 926,330
        471,869 -> 471,561
        970,735 -> 401,735
        612,624 -> 612,88
        844,879 -> 844,453
        400,38 -> 400,350
        832,225 -> 984,225
        971,642 -> 42,642
        70,862 -> 447,485
        183,79 -> 183,708
        598,700 -> 598,287
        635,195 -> 39,195
        587,362 -> 349,362
        108,88 -> 965,945
        700,299 -> 165,299
        295,824 -> 785,334
        211,284 -> 390,105
        288,326 -> 672,710
        595,231 -> 595,679
        671,576 -> 813,718
        14,845 -> 784,75
        700,129 -> 43,129
        83,913 -> 889,107
        830,596 -> 322,596
        391,450 -> 391,779
        384,32 -> 384,430
        311,948 -> 938,321
        460,288 -> 460,392
        924,602 -> 924,595
        703,458 -> 703,475
        335,953 -> 335,195
        692,314 -> 927,314
        131,433 -> 131,737
        590,771 -> 965,771
        650,13 -> 963,13
        586,904 -> 658,976
        238,824 -> 782,824
        366,45 -> 691,370
        428,758 -> 201,758
        240,545 -> 30,545
        396,154 -> 332,154
        549,307 -> 233,307
        187,240 -> 851,904
        151,135 -> 937,921
        342,850 -> 342,156
        695,200 -> 695,754
        385,880 -> 893,372
        986,966 -> 813,966
        727,661 -> 727,402
        316,937 -> 316,797
        422,235 -> 422,282
        965,684 -> 882,684
        266,222 -> 419,69
        649,843 -> 635,857
        618,84 -> 126,576
        588,822 -> 588,636
        569,142 -> 569,607
        899,479 -> 488,890
        986,52 -> 369,52
        987,478 -> 551,914
        867,951 -> 973,845
        90,401 -> 304,401
        60,836 -> 798,836
        143,675 -> 686,675
        743,974 -> 743,305
        981,899 -> 551,469
        705,430 -> 493,430
        301,366 -> 823,366
        978,712 -> 617,712
        426,805 -> 426,345
        532,855 -> 532,54
        612,143 -> 612,133
        57,52 -> 955,950
        880,50 -> 16,914
        89,908 -> 89,214
        487,867 -> 586,867
        181,285 -> 181,470
        526,666 -> 86,226
        117,704 -> 117,961
        289,101 -> 983,795
        586,429 -> 442,429
        442,869 -> 734,869
        564,479 -> 564,382
        447,486 -> 62,101
        42,218 -> 509,218
        21,890 -> 843,68
        84,978 -> 921,141
        590,960 -> 590,934
        54,949 -> 967,36
        799,39 -> 767,39
        979,232 -> 979,628
        489,482 -> 339,482
        759,473 -> 290,942
        960,958 -> 32,30
        134,180 -> 134,864
        972,981 -> 13,22
        106,385 -> 11,385
        849,454 -> 447,454
        477,385 -> 955,863
        853,180 -> 922,180
        509,274 -> 751,32
        905,295 -> 779,295
        661,629 -> 104,629
        935,117 -> 93,959
        165,372 -> 746,953
        988,141 -> 122,141
        625,621 -> 625,406
        24,710 -> 465,710
        417,468 -> 851,34
        365,285 -> 572,285
        217,164 -> 217,214
        943,439 -> 465,439
        80,102 -> 80,717
        869,19 -> 54,834
        399,480 -> 399,458
        644,826 -> 644,911
        651,189 -> 651,687
        671,946 -> 332,607
        531,417 -> 657,417
        847,350 -> 847,112
        315,733 -> 871,177
        749,118 -> 692,118
        55,616 -> 55,894
        570,307 -> 633,307
        12,964 -> 883,93
        84,299 -> 84,185
        49,187 -> 903,187
        592,40 -> 842,40
        639,381 -> 802,544
        59,61 -> 836,61
        968,51 -> 266,753
        883,373 -> 883,130
        612,45 -> 406,45
        206,698 -> 206,823
        385,685 -> 385,46
        656,338 -> 73,921
        256,794 -> 365,903
        671,247 -> 248,247
        722,509 -> 635,422
        460,783 -> 615,783
        946,980 -> 946,129
        343,780 -> 343,723
        218,371 -> 218,856
        363,809 -> 143,589
        434,739 -> 889,739
        75,71 -> 975,971
        57,253 -> 582,778
        976,237 -> 976,148
        386,866 -> 386,544
        901,797 -> 901,630
        976,706 -> 195,706
        264,420 -> 272,428
        693,72 -> 693,379
        888,832 -> 888,490
        363,900 -> 363,350
        25,312 -> 25,58
        292,307 -> 481,307
        715,393 -> 976,132
        641,450 -> 96,450
        650,38 -> 432,38
        339,97 -> 476,97
        916,24 -> 13,927
        933,934 -> 34,35
        971,367 -> 971,919
        726,310 -> 477,559
        12,984 -> 986,10
        318,531 -> 318,72
        604,979 -> 12,387
        890,39 -> 890,213
        944,954 -> 33,43
        507,830 -> 284,607
        724,111 -> 724,242
        425,912 -> 425,445
        371,903 -> 371,634
        415,314 -> 415,509
        884,849 -> 884,454
        726,647 -> 447,926
        588,463 -> 588,426
        807,453 -> 807,593
        32,449 -> 975,449
        593,757 -> 593,607
        521,850 -> 521,139
        843,478 -> 843,317
        408,834 -> 408,455
        65,241 -> 864,241
        532,138 -> 613,138
        477,239 -> 477,676
        92,400 -> 92,935
        268,104 -> 300,104
        942,20 -> 93,869
        294,134 -> 695,134
        748,477 -> 748,311
        581,879 -> 481,879
        292,57 -> 874,639
        829,787 -> 944,787
        130,780 -> 442,780
        754,435 -> 956,435
        306,659 -> 306,491
        252,612 -> 646,612
        846,949 -> 846,924
        197,888 -> 145,836
        156,790 -> 151,790
        903,305 -> 671,73
        195,79 -> 195,40
        781,67 -> 781,635
        742,743 -> 742,280
        297,42 -> 618,42
        237,151 -> 156,151
        851,930 -> 47,126
        425,368 -> 659,134
        57,890 -> 898,49
        86,62 -> 86,445
        133,499 -> 133,604
        202,567 -> 872,567
        749,578 -> 749,804
        379,379 -> 147,379
        510,474 -> 510,388
        184,115 -> 738,115
        904,613 -> 550,613
        755,649 -> 755,305
        461,306 -> 461,547
        469,124 -> 542,124
        736,218 -> 736,968
        307,662 -> 307,188
        360,970 -> 58,668
        36,267 -> 214,267
        980,330 -> 22,330
        222,972 -> 222,178
        846,774 -> 714,774
        798,837 -> 789,837
        567,258 -> 567,502
        325,582 -> 325,976
        138,386 -> 138,691
        326,878 -> 326,386
        790,276 -> 811,276
        517,522 -> 81,86
        493,567 -> 406,567
        522,370 -> 13,370
        31,697 -> 607,121
        297,524 -> 297,320
        790,681 -> 753,681
        90,961 -> 901,150
        262,46 -> 262,68
        18,26 -> 977,985
        782,381 -> 956,381
        353,740 -> 353,595
        32,448 -> 941,448
        405,254 -> 686,254
        853,57 -> 297,613
        555,209 -> 439,209
        765,679 -> 142,56
        175,903 -> 175,685
        693,653 -> 845,653
        394,108 -> 394,901
        351,108 -> 335,108
        841,83 -> 841,716
        525,608 -> 525,496
        874,32 -> 874,214
        354,760 -> 44,760
        249,330 -> 864,945
        553,377 -> 553,944
        903,374 -> 335,374
        387,34 -> 387,86
        380,331 -> 380,124
        618,520 -> 797,520
        718,169 -> 703,169
        355,184 -> 851,184
        582,570 -> 582,313
        312,952 -> 312,460
        269,70 -> 269,197
        701,907 -> 701,768
        645,417 -> 645,548
        931,532 -> 367,532
        497,361 -> 497,348
        563,642 -> 976,642
        376,504 -> 376,448
        538,945 -> 538,773
        594,886 -> 594,281
        879,558 -> 192,558
        985,68 -> 66,987
        599,420 -> 599,41
        296,318 -> 296,132
        330,619 -> 302,619
        245,137 -> 918,810
        823,798 -> 556,531
        64,201 -> 723,860
        955,365 -> 955,829
        372,976 -> 255,859
        804,962 -> 168,962
        200,442 -> 200,97
        965,964 -> 870,869
        534,158 -> 128,564
        380,739 -> 577,542
        740,391 -> 740,651
        167,177 -> 619,177
        215,449 -> 215,330
        494,612 -> 19,137
        458,634 -> 458,257
        884,817 -> 393,326
        407,291 -> 19,679
        627,173 -> 627,570
        53,93 -> 552,592
        809,363 -> 119,363
        588,418 -> 588,764
        807,131 -> 807,834
        616,61 -> 514,61
        553,642 -> 236,325
        959,553 -> 683,553
        36,754 -> 36,830
        533,293 -> 144,293
        950,780 -> 396,780
        949,878 -> 14,878
        453,180 -> 989,180
        22,46 -> 670,694
        479,206 -> 479,552
        22,53 -> 599,53
        254,964 -> 884,334
        578,813 -> 100,813
        945,247 -> 778,80
        312,978 -> 312,518
        882,225 -> 882,967
        581,683 -> 293,395
        107,540 -> 534,967
        382,946 -> 28,946
        864,743 -> 246,743
        538,558 -> 733,753
        811,436 -> 814,436
        982,33 -> 65,950
        785,829 -> 945,829
        322,471 -> 346,471
        904,528 -> 904,669
        231,471 -> 772,471
        773,490 -> 669,386
        867,482 -> 417,32
        352,856 -> 352,478
        723,355 -> 619,355
        667,922 -> 667,247
        642,386 -> 241,386
        594,35 -> 594,580
        916,723 -> 793,723
        73,774 -> 269,970
        43,273 -> 148,168
        744,637 -> 825,637
        98,30 -> 98,383
        130,277 -> 802,277
        167,122 -> 672,627
        871,866 -> 564,559
        923,475 -> 539,859
        422,714 -> 422,946
        667,950 -> 667,640
        758,181 -> 12,927
        129,927 -> 129,288
        485,661 -> 402,661
        114,573 -> 974,573
        674,779 -> 851,779
        977,184 -> 977,143
        229,937 -> 229,138
        520,887 -> 520,512
        918,329 -> 918,990
        732,41 -> 521,41
        399,245 -> 883,729
        824,618 -> 356,618
        215,218 -> 845,848
        704,34 -> 307,431
        124,166 -> 696,738
        692,749 -> 839,749
        790,637 -> 790,598
        697,396 -> 669,396
        419,140 -> 113,446
        426,738 -> 171,738
        489,494 -> 190,793
        320,301 -> 320,398
        275,809 -> 275,717
        537,703 -> 465,703
        536,450 -> 560,450
        153,927 -> 914,166
        246,692 -> 485,453
        26,179 -> 26,554
        487,678 -> 487,696
        807,719 -> 224,719
        605,920 -> 899,920
        112,262 -> 112,765
        752,898 -> 752,429
        861,103 -> 861,477
        628,505 -> 628,248
        556,293 -> 556,276
        826,682 -> 273,129
        685,324 -> 685,692
        544,410 -> 544,678
        796,633 -> 796,950
        753,843 -> 753,936
        817,40 -> 817,600
        137,941 -> 677,401
        563,457 -> 599,457
        251,644 -> 251,67
        170,792 -> 805,792
        171,486 -> 171,877
        337,481 -> 268,412
        43,158 -> 44,158
        148,610 -> 863,610
        332,765 -> 202,765
        307,637 -> 334,637
        557,380 -> 231,54
        858,76 -> 150,784
        477,329 -> 319,329
        306,608 -> 306,38
        245,42 -> 245,929
        15,786 -> 745,786
        946,321 -> 841,321
        837,281 -> 837,762
        847,391 -> 847,840
        304,52 -> 304,299
        938,122 -> 877,122
        214,347 -> 862,347
        494,540 -> 751,540
        184,29 -> 913,758
        904,12 -> 15,901
        573,23 -> 158,23
        926,603 -> 643,603
        105,506 -> 518,506
        551,917 -> 983,917
        708,33 -> 831,33
        347,173 -> 218,44
        933,175 -> 933,781
        902,556 -> 902,812
        556,485 -> 252,789
        823,807 -> 368,352
        217,744 -> 217,470
        795,455 -> 795,783
        170,944 -> 926,188
        55,655 -> 258,655
        158,57 -> 959,858
        714,823 -> 714,550
        238,18 -> 388,18
        980,985 -> 12,17
        360,596 -> 770,596
        846,684 -> 220,58
        552,107 -> 552,974
        228,552 -> 354,552
        421,41 -> 421,103
        674,475 -> 912,475
        455,626 -> 455,683
        952,841 -> 946,841
        920,792 -> 381,253
        786,918 -> 786,175
        889,859 -> 889,24
        178,604 -> 573,209
        71,621 -> 550,621
        38,36 -> 922,920
        104,690 -> 575,690
        252,883 -> 894,241
        627,107 -> 417,107
        768,913 -> 13,158
        708,337 -> 708,407
        156,941 -> 156,297
        814,653 -> 814,829
        234,920 -> 896,920
        652,170 -> 128,170
        765,825 -> 347,825
        681,901 -> 681,112
        410,301 -> 979,301
        462,681 -> 462,726
        117,957 -> 117,693
        479,948 -> 698,948
        839,965 -> 97,223
        102,189 -> 102,366
        93,798 -> 819,72
        27,336 -> 27,655
        161,635 -> 527,269
        140,272 -> 140,336
        884,915 -> 41,72
        575,563 -> 155,563
        387,601 -> 387,597
        355,186 -> 782,613
        866,435 -> 816,435
        96,161 -> 764,161
        971,29 -> 21,979
    """.trimIndent()