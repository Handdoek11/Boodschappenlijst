package j2;

import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5835i;
import h2.InterfaceC5836j;
import java.util.Set;

/* renamed from: j2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6068q implements InterfaceC5836j {

    /* renamed from: a, reason: collision with root package name */
    private final Set f38212a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6067p f38213b;

    /* renamed from: c, reason: collision with root package name */
    private final t f38214c;

    C6068q(Set set, AbstractC6067p abstractC6067p, t tVar) {
        this.f38212a = set;
        this.f38213b = abstractC6067p;
        this.f38214c = tVar;
    }

    @Override // h2.InterfaceC5836j
    public InterfaceC5835i a(String str, Class cls, C5829c c5829c, InterfaceC5834h interfaceC5834h) {
        if (this.f38212a.contains(c5829c)) {
            return new C6070s(this.f38213b, str, c5829c, interfaceC5834h, this.f38214c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c5829c, this.f38212a));
    }
}
