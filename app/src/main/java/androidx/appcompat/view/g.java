package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.f0;
import f.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.InterfaceMenuC6720a;
import z0.AbstractC6997A;
import z0.AbstractC7015b;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f7007e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f7008f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f7009a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f7010b;

    /* renamed from: c, reason: collision with root package name */
    Context f7011c;

    /* renamed from: d, reason: collision with root package name */
    private Object f7012d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: t, reason: collision with root package name */
        private static final Class[] f7013t = {MenuItem.class};

        /* renamed from: o, reason: collision with root package name */
        private Object f7014o;

        /* renamed from: s, reason: collision with root package name */
        private Method f7015s;

        public a(Object obj, String str) {
            this.f7014o = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7015s = cls.getMethod(str, f7013t);
            } catch (Exception e8) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7015s.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7015s.invoke(this.f7014o, menuItem)).booleanValue();
                }
                this.f7015s.invoke(this.f7014o, menuItem);
                return true;
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC7015b f7016A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f7017B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f7018C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f7019D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f7020E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f7022a;

        /* renamed from: b, reason: collision with root package name */
        private int f7023b;

        /* renamed from: c, reason: collision with root package name */
        private int f7024c;

        /* renamed from: d, reason: collision with root package name */
        private int f7025d;

        /* renamed from: e, reason: collision with root package name */
        private int f7026e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7027f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7028g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f7029h;

        /* renamed from: i, reason: collision with root package name */
        private int f7030i;

        /* renamed from: j, reason: collision with root package name */
        private int f7031j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f7032k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f7033l;

        /* renamed from: m, reason: collision with root package name */
        private int f7034m;

        /* renamed from: n, reason: collision with root package name */
        private char f7035n;

        /* renamed from: o, reason: collision with root package name */
        private int f7036o;

        /* renamed from: p, reason: collision with root package name */
        private char f7037p;

        /* renamed from: q, reason: collision with root package name */
        private int f7038q;

        /* renamed from: r, reason: collision with root package name */
        private int f7039r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f7040s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f7041t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f7042u;

        /* renamed from: v, reason: collision with root package name */
        private int f7043v;

        /* renamed from: w, reason: collision with root package name */
        private int f7044w;

        /* renamed from: x, reason: collision with root package name */
        private String f7045x;

        /* renamed from: y, reason: collision with root package name */
        private String f7046y;

        /* renamed from: z, reason: collision with root package name */
        private String f7047z;

        public b(Menu menu) {
            this.f7022a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f7011c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e8) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z7 = false;
            menuItem.setChecked(this.f7040s).setVisible(this.f7041t).setEnabled(this.f7042u).setCheckable(this.f7039r >= 1).setTitleCondensed(this.f7033l).setIcon(this.f7034m);
            int i8 = this.f7043v;
            if (i8 >= 0) {
                menuItem.setShowAsAction(i8);
            }
            if (this.f7047z != null) {
                if (g.this.f7011c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f7047z));
            }
            if (this.f7039r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof k.c) {
                    ((k.c) menuItem).h(true);
                }
            }
            String str = this.f7045x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f7007e, g.this.f7009a));
                z7 = true;
            }
            int i9 = this.f7044w;
            if (i9 > 0) {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i9);
                }
            }
            AbstractC7015b abstractC7015b = this.f7016A;
            if (abstractC7015b != null) {
                AbstractC6997A.a(menuItem, abstractC7015b);
            }
            AbstractC6997A.c(menuItem, this.f7017B);
            AbstractC6997A.g(menuItem, this.f7018C);
            AbstractC6997A.b(menuItem, this.f7035n, this.f7036o);
            AbstractC6997A.f(menuItem, this.f7037p, this.f7038q);
            PorterDuff.Mode mode = this.f7020E;
            if (mode != null) {
                AbstractC6997A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f7019D;
            if (colorStateList != null) {
                AbstractC6997A.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f7029h = true;
            i(this.f7022a.add(this.f7023b, this.f7030i, this.f7031j, this.f7032k));
        }

        public SubMenu b() {
            this.f7029h = true;
            SubMenu addSubMenu = this.f7022a.addSubMenu(this.f7023b, this.f7030i, this.f7031j, this.f7032k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f7029h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f7011c.obtainStyledAttributes(attributeSet, j.f35741o1);
            this.f7023b = obtainStyledAttributes.getResourceId(j.f35751q1, 0);
            this.f7024c = obtainStyledAttributes.getInt(j.f35761s1, 0);
            this.f7025d = obtainStyledAttributes.getInt(j.f35766t1, 0);
            this.f7026e = obtainStyledAttributes.getInt(j.f35771u1, 0);
            this.f7027f = obtainStyledAttributes.getBoolean(j.f35756r1, true);
            this.f7028g = obtainStyledAttributes.getBoolean(j.f35746p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            f0 u7 = f0.u(g.this.f7011c, attributeSet, j.f35776v1);
            this.f7030i = u7.n(j.f35791y1, 0);
            this.f7031j = (u7.k(j.f35554B1, this.f7024c) & (-65536)) | (u7.k(j.f35559C1, this.f7025d) & 65535);
            this.f7032k = u7.p(j.f35564D1);
            this.f7033l = u7.p(j.f35569E1);
            this.f7034m = u7.n(j.f35781w1, 0);
            this.f7035n = c(u7.o(j.f35574F1));
            this.f7036o = u7.k(j.f35609M1, 4096);
            this.f7037p = c(u7.o(j.f35579G1));
            this.f7038q = u7.k(j.f35629Q1, 4096);
            if (u7.s(j.f35584H1)) {
                this.f7039r = u7.a(j.f35584H1, false) ? 1 : 0;
            } else {
                this.f7039r = this.f7026e;
            }
            this.f7040s = u7.a(j.f35796z1, false);
            this.f7041t = u7.a(j.f35549A1, this.f7027f);
            this.f7042u = u7.a(j.f35786x1, this.f7028g);
            this.f7043v = u7.k(j.f35634R1, -1);
            this.f7047z = u7.o(j.f35589I1);
            this.f7044w = u7.n(j.f35594J1, 0);
            this.f7045x = u7.o(j.f35604L1);
            String o8 = u7.o(j.f35599K1);
            this.f7046y = o8;
            boolean z7 = o8 != null;
            if (z7 && this.f7044w == 0 && this.f7045x == null) {
                this.f7016A = (AbstractC7015b) e(o8, g.f7008f, g.this.f7010b);
            } else {
                if (z7) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f7016A = null;
            }
            this.f7017B = u7.p(j.f35614N1);
            this.f7018C = u7.p(j.f35639S1);
            if (u7.s(j.f35624P1)) {
                this.f7020E = O.e(u7.k(j.f35624P1, -1), this.f7020E);
            } else {
                this.f7020E = null;
            }
            if (u7.s(j.f35619O1)) {
                this.f7019D = u7.c(j.f35619O1);
            } else {
                this.f7019D = null;
            }
            u7.x();
            this.f7029h = false;
        }

        public void h() {
            this.f7023b = 0;
            this.f7024c = 0;
            this.f7025d = 0;
            this.f7026e = 0;
            this.f7027f = true;
            this.f7028g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f7007e = clsArr;
        f7008f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f7011c = context;
        Object[] objArr = {context};
        this.f7009a = objArr;
        this.f7010b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (!z7) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z8 && name2.equals(str)) {
                        z8 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC7015b abstractC7015b = bVar.f7016A;
                            if (abstractC7015b == null || !abstractC7015b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z7 = true;
                    }
                }
            } else if (!z8) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z8 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f7012d == null) {
            this.f7012d = a(this.f7011c);
        }
        return this.f7012d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i8, Menu menu) {
        if (!(menu instanceof InterfaceMenuC6720a)) {
            super.inflate(i8, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z7 = false;
        try {
            try {
                xmlResourceParser = this.f7011c.getResources().getLayout(i8);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.e) {
                    androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) menu;
                    if (eVar.F()) {
                        eVar.e0();
                        z7 = true;
                    }
                }
                c(xmlResourceParser, asAttributeSet, menu);
                if (z7) {
                    ((androidx.appcompat.view.menu.e) menu).d0();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            } catch (XmlPullParserException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            }
        } catch (Throwable th) {
            if (z7) {
                ((androidx.appcompat.view.menu.e) menu).d0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
