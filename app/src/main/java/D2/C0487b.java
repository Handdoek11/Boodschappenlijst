package D2;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import w2.C6882h;

/* renamed from: D2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487b {

    /* renamed from: a, reason: collision with root package name */
    private final C6882h[] f1208a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1209b;

    public C0487b(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, w2.s.f44296a);
        String string = obtainAttributes.getString(w2.s.f44297b);
        String string2 = obtainAttributes.getString(w2.s.f44298c);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.f1208a = c(string);
        } else {
            if (!isEmpty || isEmpty2) {
                if (isEmpty) {
                    obtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f1208a = c(string2);
        }
        String string3 = obtainAttributes.getString(w2.s.f44299d);
        this.f1209b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static C6882h[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        C6882h[] c6882hArr = new C6882h[length];
        for (int i8 = 0; i8 < split.length; i8++) {
            String trim = split[i8].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c6882hArr[i8] = new C6882h("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                c6882hArr[i8] = C6882h.f44271i;
            } else if ("LARGE_BANNER".equals(trim)) {
                c6882hArr[i8] = C6882h.f44273k;
            } else if ("FULL_BANNER".equals(trim)) {
                c6882hArr[i8] = C6882h.f44272j;
            } else if ("LEADERBOARD".equals(trim)) {
                c6882hArr[i8] = C6882h.f44274l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c6882hArr[i8] = C6882h.f44275m;
            } else if ("SMART_BANNER".equals(trim)) {
                c6882hArr[i8] = C6882h.f44277o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c6882hArr[i8] = C6882h.f44276n;
            } else if ("FLUID".equals(trim)) {
                c6882hArr[i8] = C6882h.f44278p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                c6882hArr[i8] = C6882h.f44281s;
            }
        }
        if (length != 0) {
            return c6882hArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final String a() {
        return this.f1209b;
    }

    public final C6882h[] b(boolean z7) {
        if (z7 || this.f1208a.length == 1) {
            return this.f1208a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
