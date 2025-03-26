package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final String f8303o;

    /* renamed from: s, reason: collision with root package name */
    private final int f8304s;

    /* renamed from: t, reason: collision with root package name */
    private final String f8305t;

    public String a() {
        return this.f8303o + " (" + this.f8305t + " at line " + this.f8304s + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
