package io.ktor.http.parsing;

/* loaded from: classes2.dex */
public final class ParseException extends IllegalArgumentException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36756o;

    /* renamed from: s, reason: collision with root package name */
    private final Throwable f36757s;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f36757s;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36756o;
    }
}
