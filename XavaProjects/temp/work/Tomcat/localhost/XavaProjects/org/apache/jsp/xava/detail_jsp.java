/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-11-27 21:04:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.openxava.view.View;
import org.openxava.util.XavaPreferences;
import org.openxava.view.meta.MetaGroup;
import org.openxava.view.meta.PropertiesSeparator;
import org.openxava.model.meta.MetaProperty;
import org.openxava.model.meta.MetaReference;
import org.openxava.model.meta.MetaCollection;
import org.openxava.web.WebEditors;
import org.openxava.web.taglib.IdTag;
import org.openxava.web.Ids;
import org.openxava.model.meta.MetaMember;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


private boolean hasFrame(MetaMember m, View view) { 
	if (m instanceof MetaProperty) {
		return WebEditors.hasFrame((MetaProperty) m, view.getViewName());
	}
  	if (m instanceof MetaReference) {
  		return !view.displayReferenceWithNoFrameEditor((MetaReference) m);  		
  	}
  	return true;
}

private String openDivForFrame(View view) { 
	if (view.isFrame()) return openDiv(view);
	return "<div>" + openDiv(view);
}

private String closeDivForFrame(View view) { 
	if (view.isFrame()) return closeDiv(view);
	return closeDiv(view) + "</div>";
}

private String openDiv(View view) {
	if (view.isFlowLayout()) return ""; 
	return view.isFrame()?"<div class='ox-layout-detail'>":""; 
}

private String closeDiv(View view) {
	if (view.isFlowLayout()) return ""; 
	return view.isFrame()?"</div>":"";
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1574881707729L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1574881716986L));
    _jspx_dependants.put("jar:file:/C:/Users/javie/git/xavaprojects/XavaProjects/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javie/git/xavaprojects/XavaProjects/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1574881717082L));
    _jspx_dependants.put("/xava/referenceFrameHeaderExt.jsp", Long.valueOf(1573580436633L));
    _jspx_dependants.put("/xava/propertyActionsExt.jsp", Long.valueOf(1573580440205L));
    _jspx_dependants.put("/xava/collectionFrameHeaderExt.jsp", Long.valueOf(1573580431614L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.model.meta.MetaCollection");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.view.meta.MetaGroup");
    _jspx_imports_classes.add("org.openxava.model.meta.MetaReference");
    _jspx_imports_classes.add("org.openxava.web.taglib.IdTag");
    _jspx_imports_classes.add("org.openxava.model.meta.MetaMember");
    _jspx_imports_classes.add("org.openxava.view.View");
    _jspx_imports_classes.add("org.openxava.view.meta.PropertiesSeparator");
    _jspx_imports_classes.add("org.openxava.web.WebEditors");
    _jspx_imports_classes.add("org.openxava.web.Ids");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.util.Messages errors = null;
      errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (errors == null){
        errors = new org.openxava.util.Messages();
        _jspx_page_context.setAttribute("errors", errors, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
view.setViewObject(viewObject); 
String propertyPrefix = request.getParameter("propertyPrefix");
String representsSection = request.getParameter("representsSection");
boolean isSection = "true".equalsIgnoreCase(representsSection);
propertyPrefix = (propertyPrefix == null || "null".equals(propertyPrefix))?"":propertyPrefix; 
view.setPropertyPrefix(propertyPrefix);
boolean onlySections = view.hasSections() && view.getMetaMembers().isEmpty(); 

      out.write('\n');
      out.write('\n');

if (!onlySections) {	// IF Not Only Sections

      out.write("\t\n");
      out.write("\t\t");
      out.print(openDiv(view));
      out.write('	');
      out.write('\n');

	Iterator it = view.getMetaMembers().iterator();
	String sfirst = request.getParameter("first");
	boolean first = !"false".equals(sfirst);
	while (it.hasNext()) {	// WHILE hasNext
		MetaMember m = (MetaMember) it.next();
		int frameWidth = view.isVariousMembersInSameLine(m)?0:100;
		if (m instanceof MetaProperty) {	// IF MetaProperty	
			MetaProperty p = (MetaProperty) m;		
			if (!PropertiesSeparator.INSTANCE.equals(m)) {	// IF Not Properties Separator	
				boolean hasFrame = WebEditors.hasFrame(p, view.getViewName());
				String propertyKey= Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						propertyPrefix + p.getName());
				request.setAttribute(propertyKey, p);
				String urlEditor = "editor.jsp" // in this way because websphere 6 has problems with jsp:param
					+ "?propertyKey=" + propertyKey
					+ "&first=" + first
					+ "&hasFrame=" + hasFrame;		
				boolean withFrame = hasFrame && 
					(!view.isSection() || view.getMetaMembers().size() > 1);
				if (withFrame) { // IF MetaPropertt With Frame			 					
					String labelKey = Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						"label_" + propertyPrefix + p.getName()); 
					String label = view.getLabelFor(p);

      out.write("\n");
      out.write("\t\t\t");
      out.print(closeDivForFrame(view));
      out.write(" \n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth) );
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleStartDecoration() );
      out.write("\n");
      out.write("\t\t\t<span id=\"");
      out.print(labelKey);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span>\t\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleEndDecoration() );
      out.write("\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
					String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + p.getName());
					String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
						"&closed=" + view.isFrameClosed(frameId); 

      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\n");
      out.write("\t\t\t");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderEndDecoration() );
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)));
      out.write('\n');
	
				} // END MetaProperty With Frame 

      out.write(" \n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlEditor, out, false);
      out.write('	');
      out.write('	');
      out.write('\n');

				if (withFrame) { // IF MetaProperty With Frame

      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write("\n");
      out.write("\t\t\t");
      out.print(openDivForFrame(view));
      out.write(" \t\t\n");

				} // END IF MetaProperty With Frame		
				first = false;
			} // END IF Not Properties Separator
			else { // IF Properties Separator
				if (!it.hasNext()) break; 					
				first = true;						

      out.write("\n");
      out.write("\t<div class=\"ox-layout-new-line\"></div> \t\t\t\n");
		
			} // END IF Properties Separator
		} // END IF MetaProperty
		else { // IF Not MetaProperty
		  	if (m instanceof MetaReference) { // IF MetaReference
				MetaReference ref = (MetaReference) m;
				String referenceKey = Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						propertyPrefix +  ref.getName()); 
				request.setAttribute(referenceKey, ref);
				if (view.displayReferenceWithNoFrameEditor(ref)) { // IF Display Reference Without Frame
					String urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param
						+ "?referenceKey=" + referenceKey		
						+ "&first=" + first
						+ "&frame=false&composite=false&onlyEditor=false"; 				

      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlReferenceEditor, out, false);
      out.write('\n');

					first = false;		
				} // END IF Display MetaReference Without Frame
				else {	// IF Display MeteReference With Frame
					String viewName = viewObject + "_" + ref.getName();
					View subview = view.getSubview(ref.getName());
					context.put(request, viewName, subview);
					subview.setViewObject(viewName); 
					String propertyInReferencePrefix = propertyPrefix + ref.getName() + ".";
					boolean withFrame = subview.displayWithFrame(); 
					boolean firstForSubdetail = first || withFrame;
					if (withFrame) { // IF MetaReference With Frame					 					
						String labelKey = Ids.decorate(
							request.getParameter("application"),
							request.getParameter("module"),
							"label_" + propertyPrefix + ref.getName()); 
						String label = view.getLabelFor(ref);

      out.write("\t\t\t\t\n");
      out.write("\t\t");
      out.print(closeDivForFrame(view));
      out.write(" \n");
      out.write("\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth) );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameTitleStartDecoration() );
      out.write("\n");
      out.write("\t\t<span id=\"");
      out.print(labelKey);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span>\n");
      out.write("\t\t");
 if (!ref.isAggregate()) { 
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "referenceFrameHeader.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("referenceName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(ref.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewObject), request.getCharacterEncoding()), out, false);
      out.write('\n');
      out.write('	');
      out.write('	');
 } 
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameTitleEndDecoration() );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
						String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + ref.getName());
						String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
							"&closed=" + view.isFrameClosed(frameId); 		

      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameActionsEndDecoration());
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\t\t\t\t \t\t\t\t\t\n");
      out.write("\t\t");
      out.print(style.getFrameHeaderEndDecoration() );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)) );
      out.write("\t\t\t\t\t\t\n");
		
					} // END IF MetaReference With Frame
			
					String urlReferenceEditor = null;
					if (view.displayReferenceWithNotCompositeEditor(ref)) { // IF Display Reference Without Composite Editor
						urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param					
							+ "?referenceKey=" + referenceKey
							+ "&onlyEditor=true&frame=true&composite=false"		
							+ "&first=" + first;				
					} // END IF Display Reference Without Composite Editor
					else { // IF Display Reference With Composite Editor						
						urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param
							+ "?referenceKey=" + referenceKey
							+ "&onlyEditor=true&frame=true&composite=true"  
							+ "&refViewObject=" + viewName  
							+ "&propertyPrefix=" + propertyInReferencePrefix 
							+ "&first=" + firstForSubdetail;
					} // END IF Display Reference With Composite Editor		

      out.write("  \n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlReferenceEditor, out, false);
      out.write('\n');

					if (withFrame) { // IF MetaReference With Frame

      out.write("\t\t\t\n");
      out.write("\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(openDivForFrame(view));
      out.write(' ');
      out.write('\n');

					} // END IF MetaReference With Frame
				} // END Display MetaReference With Frame
				first = false; 
			} else if (m instanceof MetaCollection) { // IF MetaCollection
				MetaCollection collection = (MetaCollection) m;			
				boolean withFrame = !view.isSection() || view.getMetaMembers().size() > 1;
				boolean variousCollectionInLine = view.isVariousCollectionsInSameLine((MetaMember) m);

      out.write("\n");
      out.write("\t\t\t");
      out.print(closeDivForFrame(view));
      out.write('\n');
	
				if (withFrame) { // IF MetaCollection With Frame

      out.write("\t\n");
      out.write("\t\t\t\t");
      out.print(style.getCollectionFrameHeaderStartDecoration(variousCollectionInLine?50:frameWidth));
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameTitleStartDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(collection.getLabel(request) );
      out.write('\n');
 
				String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + collection.getName());
				String colletionHeaderId = frameId + "header";

      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f0_reused = false;
      try {
        _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f0.setParent(null);
        // /xava/detail.jsp(235,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f0.setName(colletionHeaderId);
        int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
        if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        _jspx_th_xava_005fid_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f0_reused);
      }
      out.write("\">\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "collectionFrameHeader.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collectionName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(collection.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewObject), request.getCharacterEncoding()), out, false);
      out.write("\t\t\t\n");
      out.write("\t\t\t\t</span>\t\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameTitleEndDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
				String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
					"&closed=" + view.isFrameClosed(frameId);

      out.write("\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\n");
      out.write("\t\t\t\t");
      out.write("\t\t\t\t \t\t\t\t\t\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameHeaderEndDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)));
      out.write('\n');

				} // END IF MetaCollection With Frame

      out.write("\t\n");
      out.write("\t\t\t\t");

				String collectionPrefix = propertyPrefix == null?collection.getName() + ".":propertyPrefix + collection.getName() + ".";
				
      out.write("\n");
      out.write("\t\t\t\t<div id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f1_reused = false;
      try {
        _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f1.setParent(null);
        // /xava/detail.jsp(258,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f1.setName("collection_" + collectionPrefix);
        int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
        if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        _jspx_th_xava_005fid_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f1_reused);
      }
      out.write("\">\t\t\t\t\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "collection.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collectionName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(collection.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewObject), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
			
				if (withFrame) { // IF MetaCollection With Frame

      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameContentEndDecoration());
      out.write("\t\t\t\n");

				} // END IF MetaCollection With Frame

      out.write("\n");
      out.write("\t\t\t");
      out.print(openDivForFrame(view));
      out.write(' ');
      out.write('\n');

			} else if (m instanceof MetaGroup) { // IF MetaGroup
				MetaGroup group = (MetaGroup) m;			
				String viewName = viewObject + "_" + group.getName();
				View subview = view.getGroupView(group.getName());			
				context.put(request, viewName, subview);

      out.write("\n");
      out.write("\t\t\t");
      out.print(closeDivForFrame(view));
      out.write(" \n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth));
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleStartDecoration());
      out.write("\n");
      out.write("\t\t\t");
 String labelId = Ids.decorate(request, "label_" + view.getPropertyPrefix() + group.getName()); 
      out.write("\n");
      out.write("\t\t\t<span id=\"");
      out.print(labelId);
      out.write('"');
      out.write('>');
      out.print(group.getLabel(request));
      out.write("</span>\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleEndDecoration());
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
				String frameId = Ids.decorate(request, "frame_group_" + view.getPropertyPrefix() + group.getName());
				String frameActionsURL = "frameActions.jsp?frameId=" + frameId + 
					"&closed=" + view.isFrameClosed(frameId); 

      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\t \t\t\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderEndDecoration());
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)) );
      out.write("\n");
      out.write("\t\t\t");
 if (view.isFlowLayout()) { 
      out.write(" \n");
      out.write("\t\t\t<div class='ox-flow-layout'>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "detail.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewName), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t");
 if (view.isFlowLayout()) { 
      out.write(" \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write("\n");
      out.write("\t\t\t");
      out.print(openDivForFrame(view));
      out.write(' ');
      out.write('\n');

			} // END IF MetaGroup
		} // END IF Not MetaProperty
	} // END While hasNext

      out.write('\n');
      out.write('\n');
      out.print(closeDiv(view));
      out.write('\n');
      out.write('\n');
 
} // END if (!onlySections) {

      out.write('\n');
      out.write('\n');

if (view.hasSections()) { // IF Has Sections

      out.write("\n");
      out.write("<div id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      boolean _jspx_th_xava_005fid_005f2_reused = false;
      try {
        _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fid_005f2.setParent(null);
        // /xava/detail.jsp(321,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fid_005f2.setName("sections_" + viewObject);
        int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
        if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        _jspx_th_xava_005fid_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fid_005f2, _jsp_getInstanceManager(), _jspx_th_xava_005fid_005f2_reused);
      }
      out.write("\" class=\"");
      out.print(style.getSections());
      out.write("\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sections.jsp", out, false);
      out.write("\n");
      out.write("</div>\t\n");
 
}

      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
