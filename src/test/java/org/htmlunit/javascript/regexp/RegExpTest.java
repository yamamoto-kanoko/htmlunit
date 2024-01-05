/*
 * Copyright (c) 2002-2024 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.javascript.regexp;

import org.htmlunit.WebDriverTestCase;
import org.htmlunit.junit.BrowserRunner;
import org.htmlunit.junit.BrowserRunner.Alerts;
import org.htmlunit.junit.BrowserRunner.HtmlUnitNYI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Tests for the RegEx support.
 *
 * @author Ronald Brill
 */
@RunWith(BrowserRunner.class)
public class RegExpTest extends WebDriverTestCase {

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"g", "true", "false", "false", "false"},
            IE = {"undefined", "true", "false", "false", "undefined"})
    @HtmlUnitNYI(IE = {"g", "true", "false", "false", "false"})
    public void globalCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'g');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"g", "true", "false", "false", "false"},
            IE = {"undefined", "true", "false", "false", "undefined"})
    @HtmlUnitNYI(IE = {"g", "true", "false", "false", "false"})
    public void global() throws Exception {
        testEvaluateProperties("/foo/g;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"i", "false", "true", "false", "false"},
            IE = {"undefined", "false", "true", "false", "undefined"})
    @HtmlUnitNYI(IE = {"i", "false", "true", "false", "false"})
    public void ignoreCaseCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'i');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"i", "false", "true", "false", "false"},
            IE = {"undefined", "false", "true", "false", "undefined"})
    @HtmlUnitNYI(IE = {"i", "false", "true", "false", "false"})
    public void ignoreCase() throws Exception {
        testEvaluateProperties("/foo/i;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"m", "false", "false", "true", "false"},
            IE = {"undefined", "false", "false", "true", "undefined"})
    @HtmlUnitNYI(IE = {"m", "false", "false", "true", "false"})
    public void multilineCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'm');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"m", "false", "false", "true", "false"},
            IE = {"undefined", "false", "false", "true", "undefined"})
    @HtmlUnitNYI(IE = {"m", "false", "false", "true", "false"})
    public void multiline() throws Exception {
        testEvaluateProperties("/foo/m;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"y", "false", "false", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"y", "false", "false", "false", "true"})
    public void stickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'y');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"y", "false", "false", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"y", "false", "false", "false", "true"})
    public void sticky() throws Exception {
        testEvaluateProperties("/foo/y;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gm", "true", "false", "true", "false"},
            IE = {"undefined", "true", "false", "true", "undefined"})
    @HtmlUnitNYI(IE = {"gm", "true", "false", "true", "false"})
    public void globalMultilineCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'gm');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gm", "true", "false", "true", "false"},
            IE = {"undefined", "true", "false", "true", "undefined"})
    @HtmlUnitNYI(IE = {"gm", "true", "false", "true", "false"})
    public void globalMultiline() throws Exception {
        testEvaluateProperties("/foo/gm;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gi", "true", "true", "false", "false"},
            IE = {"undefined", "true", "true", "false", "undefined"})
    @HtmlUnitNYI(IE = {"gi", "true", "true", "false", "false"})
    public void globalIgnoreCaseCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'ig');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gi", "true", "true", "false", "false"},
            IE = {"undefined", "true", "true", "false", "undefined"})
    @HtmlUnitNYI(IE = {"gi", "true", "true", "false", "false"})
    public void globalIgnoreCase() throws Exception {
        testEvaluateProperties("/foo/ig;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gy", "true", "false", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"gy", "true", "false", "false", "true"})
    public void globalStickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'gy');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gy", "true", "false", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"gy", "true", "false", "false", "true"})
    public void globalSticky() throws Exception {
        testEvaluateProperties("/foo/gy;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gim", "true", "true", "true", "false"},
            IE = {"undefined", "true", "true", "true", "undefined"})
    @HtmlUnitNYI(IE = {"gim", "true", "true", "true", "false"})
    public void globalMultilineIgnoreCaseCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'mig');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gim", "true", "true", "true", "false"},
            IE = {"undefined", "true", "true", "true", "undefined"})
    @HtmlUnitNYI(IE = {"gim", "true", "true", "true", "false"})
    public void globalMultilineIgnoreCase() throws Exception {
        testEvaluateProperties("/foo/gmi;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"giy", "true", "true", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"giy", "true", "true", "false", "true"})
    public void globalIgnoreCaseStickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'yig');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"giy", "true", "true", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"giy", "true", "true", "false", "true"})
    public void globalIgnoreCaseSticky() throws Exception {
        testEvaluateProperties("/foo/ygi;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gmy", "true", "false", "true", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"gmy", "true", "false", "true", "true"})
    public void globalMultilineStickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'gmy');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"gmy", "true", "false", "true", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"gmy", "true", "false", "true", "true"})
    public void globalMultilineSticky() throws Exception {
        testEvaluateProperties("/foo/gmy;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"im", "false", "true", "true", "false"},
            IE = {"undefined", "false", "true", "true", "undefined"})
    @HtmlUnitNYI(IE = {"im", "false", "true", "true", "false"})
    public void ignoreCaseMultilineCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'im');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"im", "false", "true", "true", "false"},
            IE = {"undefined", "false", "true", "true", "undefined"})
    @HtmlUnitNYI(IE = {"im", "false", "true", "true", "false"})
    public void ignoreCaseMultiline() throws Exception {
        testEvaluateProperties("/foo/mi;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"iy", "false", "true", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"iy", "false", "true", "false", "true"})
    public void ignoreCaseStickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'yi');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"iy", "false", "true", "false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"iy", "false", "true", "false", "true"})
    public void ignoreCaseSticky() throws Exception {
        testEvaluateProperties("/foo/iy;");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"my", "false", "false", "true", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"my", "false", "false", "true", "true"})
    public void multilineStickyCtor() throws Exception {
        testEvaluateProperties("new RegExp('foo', 'my');");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"my", "false", "false", "true", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"my", "false", "false", "true", "true"})
    public void multilineSticky() throws Exception {
        testEvaluateProperties("/foo/my;");
    }

    private void testEvaluateProperties(final String script) throws Exception {
        final String html =
                "<html>\n"
                + "<head>\n"
                + "<script>\n"
                + LOG_TEXTAREA_FUNCTION
                + "function test() {\n"
                + "  var regex = " + script + "\n"
                + "  log(regex.flags);\n"
                + "  log(regex.global);\n"
                + "  log(regex.ignoreCase);\n"
                + "  log(regex.multiline);\n"
                + "  log(regex.sticky);\n"
                + "}\n"
                + "</script>\n"
                + "</head>\n"
                + "<body onload='test()'>\n"
                + LOG_TEXTAREA
                + "</body></html>";

        loadPageVerifyTextArea2(html);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = "false",
            IE = {})
    @HtmlUnitNYI(IE = "false")
    public void stickyStartOfLine() throws Exception {
        final String script =
                "var regex = /^foo/y;\n"
                + "regex.lastIndex = 2;\n"
                + "log(regex.test('..foo'));";
        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"false", "true"},
            IE = {})
    @HtmlUnitNYI(IE = {"false", "true"})
    public void stickyStartOfLineMultiline() throws Exception {
        final String script =
                "var regex = /^foo/my;\n"
                + "regex.lastIndex = 2;\n"
                + "log(regex.test('..foo'))\n"
                + "regex.lastIndex = 2;\n"
                + "log(regex.test('.\\nfoo'));";
        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"2", "a", "a"},
            IE = {})
    @HtmlUnitNYI(IE = {"2", "a", "a"})
    public void stickyAndGlobal() throws Exception {
        final String script =
                "var result = 'aaba'.match(/a/yg);\n"
                + "log(result.length);\n"
                + "log(result[0]);\n"
                + "log(result[1]);\n";
        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"1", "a\na"})
    public void dotAll() throws Exception {
        final String script =
                "var result = 'a\\naba'.match(/a.a/s);\n"
                + "log(result.length);\n"
                + "log(result[0]);\n";
        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"1", "a\na"})
    public void dotAllAndGlobal() throws Exception {
        final String script =
                "var result = 'a\\naba'.match(/a.a/sg);\n"
                + "log(result.length);\n"
                + "log(result[0]);\n";
        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "", "false", "false", "false"},
            EDGE = {"get undefined", "", "false", "false", "false"},
            FF = {"get undefined", "", "false", "false", "false"},
            FF_ESR = {"get undefined", "", "false", "false", "false"},
            IE = {"get undefined", "", "false", "false", "false"})
    public void flagsProperty() throws Exception {
        testProperty("flags");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "false", "false", "false", "false"},
            EDGE = {"get undefined", "false", "false", "false", "false"},
            FF = {"get undefined", "false", "false", "false", "false"},
            FF_ESR = {"get undefined", "false", "false", "false", "false"},
            IE = {"get undefined", "false", "false", "false", "false"})
    public void globalProperty() throws Exception {
        testProperty("global");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "false", "false", "false", "false"},
            EDGE = {"get undefined", "false", "false", "false", "false"},
            FF = {"get undefined", "false", "false", "false", "false"},
            FF_ESR = {"get undefined", "false", "false", "false", "false"},
            IE = {"get undefined", "false", "false", "false", "false"})
    public void ignoreCaseProperty() throws Exception {
        testProperty("ignoreCase");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "false", "false", "false", "false"},
            EDGE = {"get undefined", "false", "false", "false", "false"},
            FF = {"get undefined", "false", "false", "false", "false"},
            FF_ESR = {"get undefined", "false", "false", "false", "false"},
            IE = {"get undefined", "false", "false", "false", "false"})
    public void multilineProperty() throws Exception {
        testProperty("multiline");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "false", "false", "false", "false"},
            EDGE = {"get undefined", "false", "false", "false", "false"},
            FF = {"get undefined", "false", "false", "false", "false"},
            FF_ESR = {"get undefined", "false", "false", "false", "false"},
            IE = {"get undefined", "false", "false", "false", "false"})
    public void stickyProperty() throws Exception {
        testProperty("sticky");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"0", "undefined", "true", "false", "undefined"},
            IE = {})
    @HtmlUnitNYI(CHROME = {"get undefined", "false", "false", "false", "false"},
            EDGE = {"get undefined", "false", "false", "false", "false"},
            FF = {"get undefined", "false", "false", "false", "false"},
            FF_ESR = {"get undefined", "false", "false", "false", "false"},
            IE = {"get undefined", "false", "false", "false", "false"})
    public void dotAllProperty() throws Exception {
        testProperty("dotAll");
    }

    private void testProperty(final String property) throws Exception {
        final String script =
                "var get = Object.getOwnPropertyDescriptor(RegExp.prototype, '" + property + "');\n"
                + "log(get.get == undefined ? 'get undefined' : get.get.length);\n"
                + "log(get.value);\n"
                + "log(get.configurable);\n"
                + "log(get.enumerable);\n"
                + "log(get.writable);\n";

        testEvaluate(script);
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    public void stringReplace() throws Exception {
        testEvaluate("xyz", "''.replace('', 'xyz')");
        testEvaluate("1", "'121'.replace('21', '')");
        testEvaluate("xyz121", "'121'.replace('', 'xyz')");
        testEvaluate("a$c21", "'121'.replace('1', 'a$c')");
        testEvaluate("a121", "'121'.replace('1', 'a$&')");
        testEvaluate("a$c21", "'121'.replace('1', 'a$$c')");
        testEvaluate("abaabe", "'abcde'.replace('cd', 'a$`')");
        testEvaluate("a21", "'121'.replace('1', 'a$`')");
        testEvaluate("abaee", "'abcde'.replace('cd', \"a$'\")");
        testEvaluate("aba", "'abcd'.replace('cd', \"a$'\")");
        testEvaluate("aba$0", "'abcd'.replace('cd', 'a$0')");
        testEvaluate("aba$1", "'abcd'.replace('cd', 'a$1')");
        testEvaluate("abCD", "'abcd'.replace('cd', function (matched) { return matched.toUpperCase() })");
        testEvaluate("", "'123456'.replace(/\\d+/, '')");
        testEvaluate("123ABCD321abcd",
                "'123abcd321abcd'.replace(/[a-z]+/, function (matched) { return matched.toUpperCase() })");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    public void stringReplaceAll() throws Exception {
        testEvaluate("xyz", "''.replaceAll('', 'xyz')");
        testEvaluate("1", "'12121'.replaceAll('21', '')");
        testEvaluate("xyz1xyz2xyz1xyz", "'121'.replaceAll('', 'xyz')");
        testEvaluate("a$c2a$c", "'121'.replaceAll('1', 'a$c')");
        testEvaluate("a12a1", "'121'.replaceAll('1', 'a$&')");
        testEvaluate("a$c2a$c", "'121'.replaceAll('1', 'a$$c')");
        testEvaluate("aaadaaabcda", "'abcdabc'.replaceAll('bc', 'a$`')");
        testEvaluate("a2a12", "'121'.replaceAll('1', 'a$`')");
        testEvaluate("aadabcdaa", "'abcdabc'.replaceAll('bc', \"a$'\")");
        testEvaluate("aadabcdaa", "'abcdabc'.replaceAll('bc', \"a$'\")");
        testEvaluate("aa$0daa$0", "'abcdabc'.replaceAll('bc', 'a$0')");
        testEvaluate("aa$1daa$1", "'abcdabc'.replaceAll('bc', 'a$1')");
        testEvaluate("", "'123456'.replaceAll(/\\d+/g, '')");
        testEvaluate("123456", "'123456'.replaceAll(undefined, '')");
        testEvaluate("afoobarb", "'afoob'.replaceAll(/(foo)/g, '$1bar')");
        testEvaluate("foobarb", "'foob'.replaceAll(/(foo)/gy, '$1bar')");
        testEvaluate("hllo", "'hello'.replaceAll(/(h)e/gy, '$1')");
        testEvaluate("$1llo", "'hello'.replaceAll(/he/g, '$1')");
        testEvaluate("I$want$these$periods$to$be$$s", "'I.want.these.periods.to.be.$s'.replaceAll(/\\./g, '$')");
        testEvaluate("food bar", "'foo bar'.replaceAll(/foo/g, '$&d')");
        testEvaluate("foo foo ", "'foo bar'.replaceAll(/bar/g, '$`')");
        testEvaluate(" bar bar", "'foo bar'.replaceAll(/foo/g, '$\\'')");
        testEvaluate("$' bar", "'foo bar'.replaceAll(/foo/g, '$$\\'')");
        testEvaluate("123FOOBAR321BARFOO123",
                "'123foobar321barfoo123'.replace(/[a-z]+/g, function (matched) { return matched.toUpperCase() })");

        testEvaluate(
                "TypeError: replaceAll must be called with a global RegExp",
                "'hello'.replaceAll(/he/i, 'x')");
    }

    /**
     * @throws Exception if an error occurs
     */
    @Test
    @Alerts(DEFAULT = {"ad$0db", "ad$0db", "ad$0dbd$0dc"},
            IE = {"adfoodb", "adfkxxxkodb", "adfoodbdfuodc"})
    public void stringReplaceAllBrowserSpecific() throws Exception {
        testEvaluate(getExpectedAlerts()[0], "'afoob'.replaceAll(/(foo)/g, 'd$0d')");
        testEvaluate(getExpectedAlerts()[1], "'afkxxxkob'.replace(/(f)k(.*)k(o)/g, 'd$0d')");
        testEvaluate(getExpectedAlerts()[2], "'afoobfuoc'.replaceAll(/(f.o)/g, 'd$0d')");
    }

    private void testEvaluate(final String expected, final String script) throws Exception {
        final String html =
                "<html>\n"
                + "<head>\n"
                + "<script>\n"
                + LOG_TEXTAREA_FUNCTION
                + "function test() {\n"
                + "  try {\n"
                + "    log(" + script + ");\n"
                + "  } catch (e) { log(e); }\n"
                + "}\n"
                + "</script>\n"
                + "</head>\n"
                + "<body onload='test()'>\n"
                + LOG_TEXTAREA
                + "</body></html>";

        final WebDriver driver = loadPage2(html);
        verifyTextArea2(driver, expected);
    }

    private void testEvaluate(final String script) throws Exception {
        final String html =
                "<html>\n"
                + "<head>\n"
                + "<script>\n"
                + LOG_TEXTAREA_FUNCTION
                + "function test() {\n"
                + script
                + "}\n"
                + "</script>\n"
                + "</head>\n"
                + "<body onload='test()'>\n"
                + LOG_TEXTAREA
                + "</body></html>";

        loadPageVerifyTextArea2(html);
    }
}
