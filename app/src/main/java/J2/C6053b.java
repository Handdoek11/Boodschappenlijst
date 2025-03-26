package j2;

import j2.AbstractC6060i;
import java.util.Arrays;
import java.util.Map;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6053b extends AbstractC6060i {

    /* renamed from: a, reason: collision with root package name */
    private final String f38155a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f38156b;

    /* renamed from: c, reason: collision with root package name */
    private final C6059h f38157c;

    /* renamed from: d, reason: collision with root package name */
    private final long f38158d;

    /* renamed from: e, reason: collision with root package name */
    private final long f38159e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f38160f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f38161g;

    /* renamed from: h, reason: collision with root package name */
    private final String f38162h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f38163i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f38164j;

    /* renamed from: j2.b$b, reason: collision with other inner class name */
    static final class C0280b extends AbstractC6060i.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38165a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f38166b;

        /* renamed from: c, reason: collision with root package name */
        private C6059h f38167c;

        /* renamed from: d, reason: collision with root package name */
        private Long f38168d;

        /* renamed from: e, reason: collision with root package name */
        private Long f38169e;

        /* renamed from: f, reason: collision with root package name */
        private Map f38170f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f38171g;

        /* renamed from: h, reason: collision with root package name */
        private String f38172h;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f38173i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f38174j;

        C0280b() {
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i d() {
            String str = "";
            if (this.f38165a == null) {
                str = " transportName";
            }
            if (this.f38167c == null) {
                str = str + " encodedPayload";
            }
            if (this.f38168d == null) {
                str = str + " eventMillis";
            }
            if (this.f38169e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f38170f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6053b(this.f38165a, this.f38166b, this.f38167c, this.f38168d.longValue(), this.f38169e.longValue(), this.f38170f, this.f38171g, this.f38172h, this.f38173i, this.f38174j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j2.AbstractC6060i.a
        protected Map e() {
            Map map = this.f38170f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // j2.AbstractC6060i.a
        protected AbstractC6060i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f38170f = map;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a g(Integer num) {
            this.f38166b = num;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a h(C6059h c6059h) {
            if (c6059h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f38167c = c6059h;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a i(long j8) {
            this.f38168d = Long.valueOf(j8);
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a j(byte[] bArr) {
            this.f38173i = bArr;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a k(byte[] bArr) {
            this.f38174j = bArr;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a l(Integer num) {
            this.f38171g = num;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a m(String str) {
            this.f38172h = str;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f38165a = str;
            return this;
        }

        @Override // j2.AbstractC6060i.a
        public AbstractC6060i.a o(long j8) {
            this.f38169e = Long.valueOf(j8);
            return this;
        }
    }

    @Override // j2.AbstractC6060i
    protected Map c() {
        return this.f38160f;
    }

    @Override // j2.AbstractC6060i
    public Integer d() {
        return this.f38156b;
    }

    @Override // j2.AbstractC6060i
    public C6059h e() {
        return this.f38157c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6060i)) {
            return false;
        }
        AbstractC6060i abstractC6060i = (AbstractC6060i) obj;
        if (this.f38155a.equals(abstractC6060i.n()) && ((num = this.f38156b) != null ? num.equals(abstractC6060i.d()) : abstractC6060i.d() == null) && this.f38157c.equals(abstractC6060i.e()) && this.f38158d == abstractC6060i.f() && this.f38159e == abstractC6060i.o() && this.f38160f.equals(abstractC6060i.c()) && ((num2 = this.f38161g) != null ? num2.equals(abstractC6060i.l()) : abstractC6060i.l() == null) && ((str = this.f38162h) != null ? str.equals(abstractC6060i.m()) : abstractC6060i.m() == null)) {
            boolean z7 = abstractC6060i instanceof C6053b;
            if (Arrays.equals(this.f38163i, z7 ? ((C6053b) abstractC6060i).f38163i : abstractC6060i.g())) {
                if (Arrays.equals(this.f38164j, z7 ? ((C6053b) abstractC6060i).f38164j : abstractC6060i.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j2.AbstractC6060i
    public long f() {
        return this.f38158d;
    }

    @Override // j2.AbstractC6060i
    public byte[] g() {
        return this.f38163i;
    }

    @Override // j2.AbstractC6060i
    public byte[] h() {
        return this.f38164j;
    }

    public int hashCode() {
        int hashCode = (this.f38155a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f38156b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f38157c.hashCode()) * 1000003;
        long j8 = this.f38158d;
        int i8 = (hashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f38159e;
        int hashCode3 = (((i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f38160f.hashCode()) * 1000003;
        Integer num2 = this.f38161g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f38162h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f38163i)) * 1000003) ^ Arrays.hashCode(this.f38164j);
    }

    @Override // j2.AbstractC6060i
    public Integer l() {
        return this.f38161g;
    }

    @Override // j2.AbstractC6060i
    public String m() {
        return this.f38162h;
    }

    @Override // j2.AbstractC6060i
    public String n() {
        return this.f38155a;
    }

    @Override // j2.AbstractC6060i
    public long o() {
        return this.f38159e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f38155a + ", code=" + this.f38156b + ", encodedPayload=" + this.f38157c + ", eventMillis=" + this.f38158d + ", uptimeMillis=" + this.f38159e + ", autoMetadata=" + this.f38160f + ", productId=" + this.f38161g + ", pseudonymousId=" + this.f38162h + ", experimentIdsClear=" + Arrays.toString(this.f38163i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f38164j) + "}";
    }

    private C6053b(String str, Integer num, C6059h c6059h, long j8, long j9, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f38155a = str;
        this.f38156b = num;
        this.f38157c = c6059h;
        this.f38158d = j8;
        this.f38159e = j9;
        this.f38160f = map;
        this.f38161g = num2;
        this.f38162h = str2;
        this.f38163i = bArr;
        this.f38164j = bArr2;
    }
}
