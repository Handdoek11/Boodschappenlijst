package J1;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3470a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
