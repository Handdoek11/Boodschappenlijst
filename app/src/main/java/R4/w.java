package R4;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f4903a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final String f4904b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f4905c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f4906d;

    static {
        String encodeToString = Base64.encodeToString(S6.h.p(v.f4902a.e()), 10);
        f4904b = encodeToString;
        f4905c = "firebase_session_" + encodeToString + "_data";
        f4906d = "firebase_session_" + encodeToString + "_settings";
    }

    private w() {
    }

    public final String a() {
        return f4905c;
    }

    public final String b() {
        return f4906d;
    }
}
