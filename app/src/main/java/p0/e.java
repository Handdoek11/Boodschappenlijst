package p0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.AbstractC6245d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final d[] f40085a;

        public c(d[] dVarArr) {
            this.f40085a = dVarArr;
        }

        public d[] a() {
            return this.f40085a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f40086a;

        /* renamed from: b, reason: collision with root package name */
        private final int f40087b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f40088c;

        /* renamed from: d, reason: collision with root package name */
        private final String f40089d;

        /* renamed from: e, reason: collision with root package name */
        private final int f40090e;

        /* renamed from: f, reason: collision with root package name */
        private final int f40091f;

        public d(String str, int i8, boolean z7, String str2, int i9, int i10) {
            this.f40086a = str;
            this.f40087b = i8;
            this.f40088c = z7;
            this.f40089d = str2;
            this.f40090e = i9;
            this.f40091f = i10;
        }

        public String a() {
            return this.f40086a;
        }

        public int b() {
            return this.f40091f;
        }

        public int c() {
            return this.f40090e;
        }

        public String d() {
            return this.f40089d;
        }

        public int e() {
            return this.f40087b;
        }

        public boolean f() {
            return this.f40088c;
        }
    }

    /* renamed from: p0.e$e, reason: collision with other inner class name */
    public static final class C0301e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final w0.f f40092a;

        /* renamed from: b, reason: collision with root package name */
        private final w0.f f40093b;

        /* renamed from: c, reason: collision with root package name */
        private final int f40094c;

        /* renamed from: d, reason: collision with root package name */
        private final int f40095d;

        /* renamed from: e, reason: collision with root package name */
        private final String f40096e;

        public C0301e(w0.f fVar, w0.f fVar2, int i8, int i9, String str) {
            this.f40092a = fVar;
            this.f40093b = fVar2;
            this.f40095d = i8;
            this.f40094c = i9;
            this.f40096e = str;
        }

        public w0.f a() {
            return this.f40093b;
        }

        public int b() {
            return this.f40095d;
        }

        public w0.f c() {
            return this.f40092a;
        }

        public String d() {
            return this.f40096e;
        }

        public int e() {
            return this.f40094c;
        }
    }

    private static int a(TypedArray typedArray, int i8) {
        return a.a(typedArray, i8);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i8) {
        if (i8 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i8);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i9 = 0; i9 < obtainTypedArray.length(); i9++) {
                    int resourceId = obtainTypedArray.getResourceId(i9, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i8)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC6245d.f39552h);
        String string = obtainAttributes.getString(AbstractC6245d.f39553i);
        String string2 = obtainAttributes.getString(AbstractC6245d.f39558n);
        String string3 = obtainAttributes.getString(AbstractC6245d.f39559o);
        String string4 = obtainAttributes.getString(AbstractC6245d.f39555k);
        int resourceId = obtainAttributes.getResourceId(AbstractC6245d.f39554j, 0);
        int integer = obtainAttributes.getInteger(AbstractC6245d.f39556l, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC6245d.f39557m, 500);
        String string5 = obtainAttributes.getString(AbstractC6245d.f39560p);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List c8 = c(resources, resourceId);
            return new C0301e(new w0.f(string, string2, string3, c8), string4 != null ? new w0.f(string, string2, string4, c8) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC6245d.f39561q);
        int i8 = obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC6245d.f39570z) ? AbstractC6245d.f39570z : AbstractC6245d.f39563s, 400);
        boolean z7 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC6245d.f39568x) ? AbstractC6245d.f39568x : AbstractC6245d.f39564t, 0);
        int i9 = obtainAttributes.hasValue(AbstractC6245d.f39528A) ? AbstractC6245d.f39528A : AbstractC6245d.f39565u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(AbstractC6245d.f39569y) ? AbstractC6245d.f39569y : AbstractC6245d.f39566v);
        int i10 = obtainAttributes.getInt(i9, 0);
        int i11 = obtainAttributes.hasValue(AbstractC6245d.f39567w) ? AbstractC6245d.f39567w : AbstractC6245d.f39562r;
        int resourceId = obtainAttributes.getResourceId(i11, 0);
        String string2 = obtainAttributes.getString(i11);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i8, z7, string, i10, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i8 = 1;
        while (i8 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i8++;
            } else if (next == 3) {
                i8--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
