package Q6;

import J6.o;
import J6.r;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import y6.AbstractC6984l;

/* loaded from: classes2.dex */
final class m implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    private final Class f4742a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f4743b;

    /* renamed from: c, reason: collision with root package name */
    private final Type[] f4744c;

    /* synthetic */ class a extends o implements I6.l {

        /* renamed from: A, reason: collision with root package name */
        public static final a f4745A = new a();

        a() {
            super(1, n.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // I6.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type type) {
            r.e(type, "p0");
            return n.g(type);
        }
    }

    public m(Class cls, Type type, List list) {
        r.e(cls, "rawType");
        r.e(list, "typeArguments");
        this.f4742a = cls;
        this.f4743b = type;
        this.f4744c = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (r.a(this.f4742a, parameterizedType.getRawType()) && r.a(this.f4743b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f4744c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f4743b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f4742a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f4743b;
        if (type != null) {
            sb.append(n.g(type));
            sb.append("$");
            sb.append(this.f4742a.getSimpleName());
        } else {
            sb.append(n.g(this.f4742a));
        }
        Type[] typeArr = this.f4744c;
        if (!(typeArr.length == 0)) {
            AbstractC6984l.F(typeArr, sb, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f4745A);
        }
        String sb2 = sb.toString();
        r.d(sb2, "toString(...)");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f4742a.hashCode();
        Type type = this.f4743b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
