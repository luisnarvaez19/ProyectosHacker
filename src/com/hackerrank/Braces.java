package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Braces {


    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] resulta = new String[100];
        for (int i = 0; i < values.length; i++) {
            resulta[i] = chequeaBraces(values[i]);
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println("Resulta: " + resulta[i]);
        }
        return resulta;
    }

    static String chequeaBraces(String valor) {
        Stack<String> stackValores = new Stack<>();
        if ((!(valor.length() % 2 == 0)) || (valor.length()== 0)) return "NO";
        HashMap<String, String> chequea = new HashMap<>();
        String valS = null;
        for (Integer i = 0; i < valor.length(); i++) {
            valS = valor.substring(i, i + 1);


            if (("{".equals(valS)) || ("[".equals(valS)) || ("(".equals(valS)))
                stackValores.push(valS);
            else if (("}".equals(valS)) || ("]".equals(valS)) || (")".equals(valS))) {
                if (stackValores.empty())
                    return "NO";
                String dev = stackValores.pop();
                switch (dev) {
                    case "{":
                        if (!("}".equals(valS)))
                            return "NO";
                        break;
                    case "[":
                        if (!("]".equals(valS)))
                            return "NO";
                        break;
                    case "(":
                        if (!(")".equals(valS)))
                            return "NO";
                        break;

                }

            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
  /*          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int valuesCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] values = new String[valuesCount];

            for (int i = 0; i < valuesCount; i++) {
                String valuesItem = scanner.nextLine();
                values[i] = valuesItem;
            }

            String[] res = braces(values);

            for (int i = 0; i < res.length; i++) {
                bufferedWriter.write(res[i]);

                if (i != res.length - 1) {
                    bufferedWriter.write("\n");
                }
            }

            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();*/
        String[] values = {
        "[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]",
        "[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}",
        "(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]",
        "){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]",
        "}(]}){",
        "((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{(",
        "{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())",
        "(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]",
        "()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])",
        "[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){][",
        "{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}",
        "()(){{}}[()()]{}{}",
        "{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])",
        "{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})",
        "][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{",
        "{{}(",
        "{[{((({}{({({()})()})[]({()[[][][]]}){}}))){}}]}{}{({((){{}[][]{}[][]{}}[{}])(())}[][])}",
        "()[[][()[]][]()](([[[(){()[[]](([]))}]]]))",
        "()[]({}{})(()){{{}}()()}({[]()}())[](){}(({()}[{}[{({{}}){({}){({})((({()})))}}}]]))",
        "}[{){({}({)})]([}{[}}{[(([])[(}){[]])([]]}(]]]]{][",
        "[{]{[{(){[}{}(([(]}])(){[[}(]){(})))}}{{)}}{}][({(}))]}({)",
        ")})[(]{][[())]{[]{{}}[)[)}[]){}](}({](}}}[}{({()]]",
        "[[[({[]}({[][[[[][[{(()[][])}()[][]][]{}]]]]}))][(()){}]]]()[{}([]{}){}{{}}]",
        "({[]({[]})}())[][{}[{{(({{{([{}])}}}))}}]]",
        "([((()))()])[][][]{}()(([]))[]()[]((){}[]){}(){{}[]}[[{[]}]]",
        "[[(((({}{[]{}()}){}{{}}){({[]{[{}]{(){}(((){()}))}()}}[[]]()()[()])[[{}{}]()]}))]]{}[]{}({({{}})})",
        "(]{()}((",
        "[][(())[({{{()[]}}{[[][[][[[]{{{[()]{{{{}{[]}[][]}}}}}}]]]]}})]]",
        "}[})})}[)]{}{)",
        "({(}{})))}(}[)[}{)}}[)[{][{(}{{}]({}{[(})[{[({{[}{(]]})}",
        "]}})[]))]{][])[}(])]({[]}[]([)",
        "[{{}{[{{[}[[}([]",
        "[([]){}][({})({[(([])[][])][[{}{([{{}{(()){{{({}{{}}())}}[]}}()[()[{{{([](()){[[[]]]})}}}]]}])}]]})]",
        "]{}{(}))}](})[{]]()(]([}]([}][}{]{[])}{{{]([][()){{})[{({{{[}{}](]}}",
        "{[{}}){(}[][)(}[}][)({[[{]}[(()[}}){}{)([)]}(()))]{)(}}}][",
        "(]{}{(}}}[)[",
        "[]{}{[[]]}([{}]{}[]){{(())}}",
        "[)([{(][(){)[)}{)]]}}([((][[}}(]{}]]}]][(({{{))[[){}{]][))[]{]][)[{{}{()]){)])))){{{[(]}[}}{}]",
        "{({(){[[[][]{}[[([]{})]{}]][[]()()]]}})}[{}{{}}]",
        ")}][(})){))[{}[}",
        "{[]{({]}[}}[{([([)([){{}{(}}[]}}[[{[}[[()(])[}[]",
        "()()()[]",
        "((){}])][]][}{]{)]]}][{]}[)(])[}[({(",
        ")[((])(]]]]((]){{{{())]}]}(}{([}(({}]])[[{){[}]{{}})[){(",
        "}][[{[((}{[]){}}[[[)({[)}]]}(]]{[)[]}{}(){}}][{()]))})]][(((}}",
        "([]){}{{}{}}()([([{}{[[]()([(([]()))()[[]]])]}])])",
        "[()[[]{{[]}()([])}[]][][]][]()[]{}{}[][]{}{}[()(){}]",
        "{[{){]({(((({](]{([])([{{([])[}(){(]](]{[{[]}}())[){})}))[{})))[",
        "{}[()[]][]{}{}[[{{[[({})]()[[()]]]}}]]",
        "{[{}[][]]}[((()))][]({})[]{}{()}",
        "(){[{({})}]}",
        "([]])][{)]({)[]))}]())[}]))][}{(}}})){]}]{[)}(][})[[",
        "((({{}(([{}(())]))[()]{[[[]()]]}})))",
        "}()))}(}]]{{})}][{](]][{]{[[]]]}]]}([)({([))[[(]}])}[}(([{)[)]]([[](]}]}{]{{})[]){]}{])(",
        "{}{}{}{[[()]][]}",
        ")]}]({{})[[[{]{{{}}][))]{{",
        "))){({}])}])}}]{)()(}(]}([",
        "([[]][])[[]()][]()(([[]]{[()[]{[][{}]}[()]]{}{[]}}{{}()}(()[([][]{})[[{}][]]{}[]])))",
        "(]{[({}[){)))}]{[{}][({[({[]))}[}]}{()(([]{]()}})}[]{[)](((]]])([]}}]){)(([]]}[[}[",
        "([[]])({}(([(){{}[{}]}]){[{}]}))[][{}{}](){}",
        "[][][][][][([])][]{({()}[[()()]{([(){[]{}}{(())}{[](){}()({}())}[({}[[]()])][]])}])}",
        "}[{{(}})}}(((())()({]{([]((][(({)[({[]]}[])}]{][{{}]{)][}(])}}}))}}}",
        "[]({})()[]{}{}[]({}{})[]{([])()[()][{()({})[{}{[[()]{}[]][]}(({{[]{()()()}{}[]()}[]}){{}{}})]}]}",
        "{{(([{)]{}({][{](){({([[[][)}[)})(",
        "[{}]{[()({[{}]})]}",
        "[[{}]]",
        "]{{({[{]}[[)]]}{}))}{){({]]}{]([)({{[]){)]{}){){}()})(]]{{])(])[]}][[()()}",
        "{[([}[[{{(]]][}()())]{){(){)]]){})}]{][][(}[]())[}[)})})[][{[)[})()][]))}[[}",
        "]()])}[}}}{]]{)[}(}]]])])}{(}{([{]({)]}])(})[{}[)]])]}[]{{)){}{()}]}((}}{({])[}])[]}",
        "(]}[{}{{][}))){{{([)([[])([]{[",
        "{(()[]){}}(){[]}({{}(()())})([]){}{}(())()[()]{}()",
        "{{}[{}[{}[]]]}{}({{[]}})[[(){}][]]{}(([]{[][]()()}{{{()()}{[]}({}[]{()})}{()}[[]][()]}))",
        "{[][]}[{}[](){}]{{}{[][{}]}}",
        "()(){}(){((){}[])([[]]())}",
        "{}[[{[((}[(}[[]{{]([(}]][[",
        "{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]",
        "{[](}([)(])[]]})()]){[({]}{{{)({}(][{{[}}(]{",
        "[][]{{}[](())}{}({[()]}())[][[][({}([{}]))]]",
        "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}"};
        braces(values);
    }
}
