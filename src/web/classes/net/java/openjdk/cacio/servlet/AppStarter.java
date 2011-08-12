package net.java.openjdk.cacio.servlet;

import java.awt.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import net.java.openjdk.awt.peer.web.*;

public class AppStarter extends SubSessionServletBase {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int width = Integer.parseInt(request.getParameter("w"));
	int height = Integer.parseInt(request.getParameter("h"));
	String backend = request.getParameter("b");

	WebSessionState state = getSessionState(request);
	state.setInitialScreenDimension(new Dimension(width, height));
	state.setBackend(CmdStreamEncoder.getBackendForName(backend));
	 new AppContextCreator().startAppInNewAppContext(state);
    }
}
