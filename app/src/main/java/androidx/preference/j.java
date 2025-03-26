package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
class j {

    /* renamed from: e, reason: collision with root package name */
    private static final Class[] f10521e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f10522f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f10523a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f10524b = new Object[2];

    /* renamed from: c, reason: collision with root package name */
    private k f10525c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f10526d;

    public j(Context context, k kVar) {
        this.f10523a = context;
        f(kVar);
    }

    private Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) f10522f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f10523a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e8 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e9) {
                                e8 = e9;
                            }
                        }
                        if (cls == null) {
                            if (e8 != null) {
                                throw e8;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f10521e);
                    constructor.setAccessible(true);
                    f10522f.put(str, constructor);
                } catch (ClassNotFoundException e10) {
                    throw e10;
                }
            } catch (Exception e11) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e11);
                throw inflateException;
            }
        }
        Object[] objArr = this.f10524b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? g(str, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e8) {
            throw e8;
        } catch (ClassNotFoundException e9) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e9);
            throw inflateException;
        } catch (Exception e10) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e10);
            throw inflateException2;
        }
    }

    private void f(k kVar) {
        this.f10525c = kVar;
        j(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    private PreferenceGroup h(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.T(this.f10525c);
        return preferenceGroup2;
    }

    private void i(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.u0(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e8) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e8);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    c().getResources().parseBundleExtra("extra", attributeSet, preference.p());
                    try {
                        k(xmlPullParser);
                    } catch (IOException e9) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e9);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b8 = b(name, attributeSet);
                    ((PreferenceGroup) preference).K0(b8);
                    i(xmlPullParser, b8, attributeSet);
                }
            }
        }
    }

    private static void k(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public Context c() {
        return this.f10523a;
    }

    public Preference d(int i8, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i8);
        try {
            return e(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    public Preference e(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup h8;
        synchronized (this.f10524b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f10524b[0] = this.f10523a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e8) {
                    throw e8;
                } catch (IOException e9) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e9.getMessage());
                    inflateException.initCause(e9);
                    throw inflateException;
                } catch (XmlPullParserException e10) {
                    InflateException inflateException2 = new InflateException(e10.getMessage());
                    inflateException2.initCause(e10);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            h8 = h(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet));
            i(xmlPullParser, h8, asAttributeSet);
        }
        return h8;
    }

    protected Preference g(String str, AttributeSet attributeSet) {
        return a(str, this.f10526d, attributeSet);
    }

    public void j(String[] strArr) {
        this.f10526d = strArr;
    }
}
