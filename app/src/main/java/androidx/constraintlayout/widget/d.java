package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f8447a;

    /* renamed from: b, reason: collision with root package name */
    int f8448b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f8449c = -1;

    /* renamed from: d, reason: collision with root package name */
    private SparseArray f8450d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f8451e = new SparseArray();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f8452a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f8453b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f8454c;

        /* renamed from: d, reason: collision with root package name */
        e f8455d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f8454c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f8611B6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8619C6) {
                    this.f8452a = obtainStyledAttributes.getResourceId(index, this.f8452a);
                } else if (index == h.f8627D6) {
                    this.f8454c = obtainStyledAttributes.getResourceId(index, this.f8454c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8454c);
                    context.getResources().getResourceName(this.f8454c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f8455d = eVar;
                        eVar.e(context, this.f8454c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f8453b.add(bVar);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f8456a;

        /* renamed from: b, reason: collision with root package name */
        float f8457b;

        /* renamed from: c, reason: collision with root package name */
        float f8458c;

        /* renamed from: d, reason: collision with root package name */
        float f8459d;

        /* renamed from: e, reason: collision with root package name */
        int f8460e;

        /* renamed from: f, reason: collision with root package name */
        e f8461f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f8456a = Float.NaN;
            this.f8457b = Float.NaN;
            this.f8458c = Float.NaN;
            this.f8459d = Float.NaN;
            this.f8460e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f8763U6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f8771V6) {
                    this.f8460e = obtainStyledAttributes.getResourceId(index, this.f8460e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8460e);
                    context.getResources().getResourceName(this.f8460e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f8461f = eVar;
                        eVar.e(context, this.f8460e);
                    }
                } else if (index == h.f8779W6) {
                    this.f8459d = obtainStyledAttributes.getDimension(index, this.f8459d);
                } else if (index == h.f8787X6) {
                    this.f8457b = obtainStyledAttributes.getDimension(index, this.f8457b);
                } else if (index == h.f8795Y6) {
                    this.f8458c = obtainStyledAttributes.getDimension(index, this.f8458c);
                } else if (index == h.f8803Z6) {
                    this.f8456a = obtainStyledAttributes.getDimension(index, this.f8456a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i8) {
        this.f8447a = constraintLayout;
        a(context, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "ConstraintLayoutStates"
            android.content.res.Resources r2 = r11.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r12)
            int r3 = r2.getEventType()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = 0
        L11:
            r5 = 1
            if (r3 == r5) goto Lab
            r6 = 2
            if (r3 == r6) goto L19
            goto L81
        L19:
            java.lang.String r3 = r2.getName()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r7 = r3.hashCode()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r8 = 4
            r9 = 3
            switch(r7) {
                case -1349929691: goto L53;
                case 80204913: goto L49;
                case 1382829617: goto L40;
                case 1657696882: goto L36;
                case 1901439077: goto L27;
                default: goto L26;
            }     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
        L26:
            goto L5d
        L27:
            java.lang.String r5 = "Variant"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r9
            goto L5e
        L31:
            r11 = move-exception
            goto L86
        L33:
            r11 = move-exception
            goto L99
        L36:
            java.lang.String r5 = "layoutDescription"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = 0
            goto L5e
        L40:
            java.lang.String r7 = "StateSet"
            boolean r3 = r3.equals(r7)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            goto L5e
        L49:
            java.lang.String r5 = "State"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r6
            goto L5e
        L53:
            java.lang.String r5 = "ConstraintSet"
            boolean r3 = r3.equals(r5)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r3 == 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = -1
        L5e:
            if (r5 == r6) goto L74
            if (r5 == r9) goto L69
            if (r5 == r8) goto L65
            goto L81
        L65:
            r10.b(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L69:
            androidx.constraintlayout.widget.d$b r3 = new androidx.constraintlayout.widget.d$b     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            if (r4 == 0) goto L81
            r4.a(r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L81
        L74:
            androidx.constraintlayout.widget.d$a r3 = new androidx.constraintlayout.widget.d$a     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r3.<init>(r11, r2)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            android.util.SparseArray r4 = r10.f8450d     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            int r5 = r3.f8452a     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4.put(r5, r3)     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            r4 = r3
        L81:
            int r3 = r2.next()     // Catch: java.io.IOException -> L31 org.xmlpull.v1.XmlPullParserException -> L33
            goto L11
        L86:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
            goto Lab
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            android.util.Log.e(r1, r12, r11)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.a(android.content.Context, int):void");
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeName = xmlPullParser.getAttributeName(i8);
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.l(context, xmlPullParser);
                this.f8451e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
