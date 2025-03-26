package kotlinx.serialization;

import J6.r;
import java.util.List;

/* loaded from: classes2.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: o, reason: collision with root package name */
    private final List f38765o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, Throwable th) {
        super(str, th);
        r.e(list, "missingFields");
        this.f38765o = list;
    }

    public final List a() {
        return this.f38765o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List list, String str) {
        String str2;
        r.e(list, "missingFields");
        r.e(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + ((String) list.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }
}
