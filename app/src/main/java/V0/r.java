package v0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f44070a;

    r(Object obj) {
        this.f44070a = q.a(obj);
    }

    @Override // v0.k
    public String a() {
        return this.f44070a.toLanguageTags();
    }

    @Override // v0.k
    public Object b() {
        return this.f44070a;
    }

    public boolean equals(Object obj) {
        return this.f44070a.equals(((k) obj).b());
    }

    @Override // v0.k
    public Locale get(int i8) {
        return this.f44070a.get(i8);
    }

    public int hashCode() {
        return this.f44070a.hashCode();
    }

    @Override // v0.k
    public boolean isEmpty() {
        return this.f44070a.isEmpty();
    }

    @Override // v0.k
    public int size() {
        return this.f44070a.size();
    }

    public String toString() {
        return this.f44070a.toString();
    }
}
