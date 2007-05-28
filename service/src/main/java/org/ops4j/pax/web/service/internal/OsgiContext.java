/*  Copyright 2007 Niclas Hedhman.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service.internal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mortbay.jetty.Handler;
import org.mortbay.jetty.handler.AbstractHandler;
import org.osgi.service.http.HttpContext;

public class OsgiContext extends AbstractHandler
    implements Handler
{
    private HttpContext m_context;
    private String m_alias;

    public OsgiContext( HttpContext context, String alias )
    {
        m_context = context;
        m_alias = alias;
    }

    public void handle( String target, HttpServletRequest request, HttpServletResponse response, int dispatch )
        throws IOException, ServletException
    {
        if( m_context.handleSecurity( request, response ) )
        {

        }
        else
        {
            // TODO: DO NOT ALLOW. Then what??
        }
    }
}
