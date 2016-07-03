
<%@page import="logica.DBConexion" %>
<%@page import="logica.Consultas" %>
<%@page import="java.sql.ResultSet"%>
<%@page import=" java.io.IOException"%>
<%@page import ="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>
            SAT - Proyecto SA Grupo 6
        </title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
         <![endif]-->

    </head>

    <body>

        <div class="nav">
            <div class='logo'></div>
            <ul class="menu">
                <li class="btMenu">
                    <a href="javascript:void(0)">MENU</a></li>
                <li class="menuItem"><a href="index.html">Home</a></li>
                <li class="menuItem"><a href="#">Consultar arancel individual</a></li>
                <li class="menuItem"><a href="#">Paquetes recibidos</a></li>
                <li class="menuItem"><a href="#">Consultar estado formulario</a></li>
                <li class="menuItem"><a href="#">Why Us</a></li>                
            </ul>
        </div>

        <!-- WRAPPER STARTS HERE-->
        <div class='wrapper'>

            <header><!-- HEADER STARTS HERE-->


                <div class='container titles yomer-text-center'>
                    <h1 data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s">SAT</h1>
                    <div class='subhead'>                        
                        <%
                        if (request.getParameter("salida") != null) {
                            String salida=request.getParameter("salida");
                            String [] arr=salida.split("_");
                            salida="<div class=\"alert alert-success fade in\">"
                                    + "<a href=\"#nogo\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>"
                                    + "<strong>"+arr[0]+"!</strong> ";
                            for(int i=0;i<arr.length;i++){
                                salida+= " "+arr[i];
                            }
                            salida+="</div>";
                            out.write(salida);
                        }                          
                        %>
                        <p>Proyecto Software Avanzado<b> Entidad SAT</b>!</p> 
                        <div class='buttons'>
                            <form method="POST" action="#">
                                <button class="form-submit googleplus" type="submit" title="Continue with Google+"></button>

                            </form>
                            <form method="POST" action="#">
                                <button class="form-submit facebook" type="submit" title="Continue with Facebook"></button>

                            </form>                 
                            <form method="GET" action="#">
                                <button class="form-submit email" type="submit" title="Continue with Email"></button>
                            </form>
                        </div> 
                    </div>
                </div>
                <div class=" logos"><img src="img/logos.png"></div>
                <a class="godown animate" href="#first">Down</a>

            </header><!-- /HEADER ENDS HERE-->
            <!-- ABOUT US STARTS HERE-->
            <section class='aboutus' id='about'>
                <div class='container'>
                    <div class="row">
                        <div class="col-md-12 yomer-text-center">
                            <h2>Consultar Arancel</h2>
                            <form action="acciones" method="post">
                                <p class="bigtext">Consultar arancel </p><input class="form-control" type="number" name="cod_arancel" id="cod_arancel" placeholder="codigo categoria"><br><input type="submit"  name="con_arancel" id="con_arancel" value="Consultar" class="btn btn-success"/>
                            </form>
                        </div>
                    </div>
                    <div class="row">                                  
                    </div>

                </div>

            </section>
            <!-- /ABOUT US ENDS HERE HERE-->
            <!-- OUR MISSION STARTS HERE-->
            <section class="ourmission " id='mission'>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 yomer-text-center">
                            <h3>Paquetes recibidos</h3> 
                            <table class="table">
                                <thead><tr class="success" ><th>No.</th><th>Fecha</th><th>Monto</th><th>Categoria</th><th>Cantidad</th></tr></thead>
                                <tbody>
                                <%-- start web service invocation --%><hr/>
                                <%
                                    try {
                                        servicios.ServiciosSATG6_Service service = new servicios.ServiciosSATG6_Service();
                                        servicios.ServiciosSATG6 port = service.getServiciosSATG6Port();
                                        // TODO initialize WS operation arguments here                                        
                                        int cuantas=0;
                                            if (request.getParameter("cantidad") == null) {
                                                cuantas=10;
                                            } else {
                                                cuantas= Integer.parseInt(request.getParameter("name"));
                                            }                                           
                                            // TODO process result here
                                            java.lang.String result = port.obtenerPaquetesRecibidos(cuantas);
                                            out.println(result);                                        
                                    } catch (Exception ex) {
                                        // TODO handle custom exceptions here
                                    }
                                %>
                                <%-- end web service invocation --%><hr/>

                                </tbody>
                            </table>                                
                            <ul class="pagination">
                                <%                                    
                                    try {                                        
                                        DBConexion db = new DBConexion();
                                        Connection con = db.conectar();
                                        Consultas consultas = new Consultas(con);                                    
                                        int cantidad=0;
                                        ResultSet rs = consultas.ExecuteQuery("select count(*) as cantidad from paquete;");
                                        while (rs.next()) {                                                                                            
                                            cantidad=rs.getInt("cantidad");
                                            break;
                                        }
                                        rs.close();
                                        con.close();
                                        int limit=cantidad/10;
                                        int residuo=cantidad%10;
                                        if(residuo!=0) limit++;
                                        System.out.println(limit);
                                        for(int i=0;i<limit;i++){
                                            out.write("<li onclick=\"ShowHide("+(i+1)+")\"><a href=\"#Nogo\">"+(i+1)+"</a></li>");
                                        }
                                    } catch (Exception ex) {
                                        System.out.println(ex.toString());
                                    }
                                    
                                %>                                                                
                            </ul>
                        </div>
                    </div>
                </div>
            </section>

            <!--/ OUR MISSION ENDS HERE-->
            <!--OUR FEATURE STARTS HERE-->
            <section class="feature" id='whyus'>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 yomer-text-center">
                            <h2>Consultar estado formulario</h2>
                            <form action="acciones" method="post">                                
                                <input class="form-control" type="number" name="id_formulario" id="id_formulario" placeholder="id formulario"><br>
                                <input type="submit" name="estado" id="estado" value="Obtener" class="btn btn-success"/>                                
                            </form>
                        </div>
                    </div>
                    <div class="row">                        
                    </div>
                </div>
            </section>
            <!--/ OUR FEATURE ENDS  HERE-->
            <!--WHY CHOSE STARTS HERE HERE-->

            <section class="whychose " id='whychose'>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 yomer-text-center">


                            <div class="col-md-12 yomer-text-center">
                                <h3>?Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia?</h3> 
                                <small>Christian Orellana, Co-Founder Hijos Del Atomo</small>
                            </div>
                        </div>
                    </div>
                </div>
            </section>



            <!-- FOOTER STARTS HERE-->
            <section class="testimonial " id='testimonial'>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="yomer-text-center">
                                <h2>What our clients say</h2>
                                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>
                            </div>
                            <div class="gap"></div>
                            <div class="row">
                                <div class="col-md-6">
                                    <blockquote>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                                        <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                                    </blockquote>
                                    <blockquote>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                                        <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                                    </blockquote>
                                </div>
                                <div class="col-md-6">
                                    <blockquote>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                                        <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                                    </blockquote>
                                    <blockquote>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>
                                        <small>Someone famous in <cite title="Source Title">Source Title</cite></small>
                                    </blockquote>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <!--/ FOOTER ENDS HERE-->

            <!-- SOCIAL STARTS HERE-->
            <section class="social " id='social'>
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 ">
                            <div class="social_icons">
                                <ul>
                                    <li class="facebook"> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-facebook"></i> </a> </li>
                                    <li class="twitter"> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-twitter"></i> </a> </li>
                                    <li class="dribbble"> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-dribbble"></i> </a> </li>
                                    <li class="googleplus"> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-google"></i> </a> </li>
                                    <li class="linkedin "> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-linkedin"></i> </a> </li>
                                    <li class="pinterest"> <a href="#." data-scroll-reveal="wait 0.25s, then enter top and move 40px over 1s"><i class="fa fa-pinterest"></i> </a> </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

            <!--/ SOCIAL ENDS HERE-->



        </div> <!-- /WRAPPER ENDS HERE DESIGNED BY VIJAYAN PP-->
        <script type='text/javascript' src='js/jquery.js'></script>
        <script type='text/javascript' src='js/bootstrap.min.js'></script>
        <script type='text/javascript' src='js/scrollReveal.js'></script>
        <script type='text/javascript'>
            jQuery(document).ready(function() {


                $(".top").click(function() {
                    $("html, body").animate({scrollTop: 0}, "slow");
                    return false;
                });
                $(".btMenu").click(function() {

                    if ($(".menu").children(".menuItem").css("display") == "none") {
                        $(".menu").children(".menuItem").slideDown();
                    }
                    else {
                        $(".menu").children(".menuItem").slideUp();
                    }
                });
                $(window).resize(function() {
                    if ($(window).innerWidth() > 900) {
                        $(".menu").children(".menuItem").css("display", "block");
                    }
                    else {
                        $(".menu").children(".menuItem").css("display", "none");
                    }
                });

                (function(k) {
                    'use strict';
                    k(['jquery'], function($) {
                        var j = $.scrollTo = function(a, b, c) {
                            return $(window).scrollTo(a, b, c)
                        };
                        j.defaults = {axis: 'xy', duration: parseFloat($.fn.jquery) >= 1.3 ? 0 : 1, limit: !0};
                        j.window = function(a) {
                            return $(window)._scrollable()
                        };
                        $.fn._scrollable = function() {
                            return this.map(function() {
                                var a = this, isWin = !a.nodeName || $.inArray(a.nodeName.toLowerCase(), ['iframe', '#document', 'html', 'body']) != -1;
                                if (!isWin)
                                    return a;
                                var b = (a.contentWindow || a).document || a.ownerDocument || a;
                                return/webkit/i.test(navigator.userAgent) || b.compatMode == 'BackCompat' ? b.body : b.documentElement
                            })
                        };
                        $.fn.scrollTo = function(f, g, h) {
                            if (typeof g == 'object') {
                                h = g;
                                g = 0
                            }
                            if (typeof h == 'function')
                                h = {onAfter: h};
                            if (f == 'max')
                                f = 9e9;
                            h = $.extend({}, j.defaults, h);
                            g = g || h.duration;
                            h.queue = h.queue && h.axis.length > 1;
                            if (h.queue)
                                g /= 2;
                            h.offset = both(h.offset);
                            h.over = both(h.over);
                            return this._scrollable().each(function() {
                                if (f == null)
                                    return;
                                var d = this, $elem = $(d), targ = f, toff, attr = {}, win = $elem.is('html,body');
                                switch (typeof targ) {
                                    case'number':
                                    case'string':
                                        if (/^([+-]=?)?\d+(\.\d+)?(px|%)?$/.test(targ)) {
                                            targ = both(targ);
                                            break
                                        }
                                        targ = win ? $(targ) : $(targ, this);
                                        if (!targ.length)
                                            return;
                                    case'object':
                                        if (targ.is || targ.style)
                                            toff = (targ = $(targ)).offset()
                                }
                                var e = $.isFunction(h.offset) && h.offset(d, targ) || h.offset;
                                $.each(h.axis.split(''), function(i, a) {
                                    var b = a == 'x' ? 'Left' : 'Top', pos = b.toLowerCase(), key = 'scroll' + b, old = d[key], max = j.max(d, a);
                                    if (toff) {
                                        attr[key] = toff[pos] + (win ? 0 : old - $elem.offset()[pos]);
                                        if (h.margin) {
                                            attr[key] -= parseInt(targ.css('margin' + b)) || 0;
                                            attr[key] -= parseInt(targ.css('border' + b + 'Width')) || 0
                                        }
                                        attr[key] += e[pos] || 0;
                                        if (h.over[pos])
                                            attr[key] += targ[a == 'x' ? 'width' : 'height']() * h.over[pos]
                                    } else {
                                        var c = targ[pos];
                                        attr[key] = c.slice && c.slice(-1) == '%' ? parseFloat(c) / 100 * max : c
                                    }
                                    if (h.limit && /^\d+$/.test(attr[key]))
                                        attr[key] = attr[key] <= 0 ? 0 : Math.min(attr[key], max);
                                    if (!i && h.queue) {
                                        if (old != attr[key])
                                            animate(h.onAfterFirst);
                                        delete attr[key]
                                    }
                                });
                                animate(h.onAfter);
                                function animate(a) {
                                    $elem.animate(attr, g, h.easing, a && function() {
                                        a.call(this, targ, h)
                                    })
                                }}
                            ).end()
                        };
                        j.max = function(a, b) {
                            var c = b == 'x' ? 'Width' : 'Height', scroll = 'scroll' + c;
                            if (!$(a).is('html,body'))
                                return a[scroll] - $(a)[c.toLowerCase()]();
                            var d = 'client' + c, html = a.ownerDocument.documentElement, body = a.ownerDocument.body;
                            return Math.max(html[scroll], body[scroll]) - Math.min(html[d], body[d])
                        };
                        function both(a) {
                            return $.isFunction(a) || typeof a == 'object' ? a : {top: a, left: a}
                        }
                        return j
                    })
                }(typeof define === 'function' && define.amd ? define : function(a, b) {
                    if (typeof module !== 'undefined' && module.exports) {
                        module.exports = b(require('jquery'))
                    } else {
                        b(jQuery)
                    }
                }));

                $(".menu").children("li:nth-child(3)").click(function() {
                    $("body").scrollTo("#about", 600);

                });

                $(".menu").children("li:nth-child(4)").click(function() {
                    $("body").scrollTo("#mission", 600);
                });

                $(".menu").children("li:nth-child(5)").click(function() {

                    $("body").scrollTo("#whyus", 600);
                });

                $(".menu").children("li:nth-child(6)").click(function() {
                    $("body").scrollTo("#whychose", 600);
                });

            });

            (function($) {
                window.scrollReveal = new scrollReveal();
            })();

        </script>

        <script>
                function ShowHide(numero) {
                    var inicio=(numero-1)*10;
                    var fin=numero*10;     
                    ocultarLosDemas(numero);
                    while(inicio<fin){
                        var trid = document.getElementById("tr_"+inicio);
                        if (trid != null) {
                            $("#tr_"+inicio).removeClass('hidden');                            
                        }
                        inicio++;
                    }
                }               
                function ocultarLosDemas(numero){
                    var i=1;
                    while(true){
                        var trid = document.getElementById("tr_"+i);
                        if (trid != null) {
                            $("#tr_"+i).addClass('hidden');                         
                        }else break;
                        i++;
                    }
                }
                ShowHide(1);
        </script>
    </body>
</html>