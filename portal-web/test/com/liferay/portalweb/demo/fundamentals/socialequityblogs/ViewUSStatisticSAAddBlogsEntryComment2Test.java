/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.demo.fundamentals.socialequityblogs;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewUSStatisticSAAddBlogsEntryComment2Test extends BaseTestCase {
	public void testViewUSStatisticSAAddBlogsEntryComment2()
		throws Exception {
		selenium.open("/web/guest/home/");
		loadRequiredJavaScriptModules();
		selenium.clickAt("link=User Statistics Test Page",
			RuntimeVariables.replace("User Statistics Test Page"));
		selenium.waitForPageToLoad("30000");
		loadRequiredJavaScriptModules();
		assertEquals(RuntimeVariables.replace("Joe Bloggs"),
			selenium.getText("xPath=(//span[@class='user-name'])[1]"));
		assertEquals(RuntimeVariables.replace(
				"Contribution Score: 0 (Total: 0)"),
			selenium.getText("xPath=(//div[@class='contribution-score'])[1]"));
		assertEquals(RuntimeVariables.replace(
				"Participation Score: 9 (Total: 9)"),
			selenium.getText("xPath=(//div[@class='participation-score'])[1]"));
	}
}