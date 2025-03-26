package K0;

import J6.AbstractC0650j;
import J6.r;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3596a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final f a(InputStream inputStream) {
            r.e(inputStream, "input");
            try {
                f O7 = f.O(inputStream);
                r.d(O7, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return O7;
            } catch (InvalidProtocolBufferException e8) {
                throw new CorruptionException("Unable to parse preferences proto.", e8);
            }
        }

        private a() {
        }
    }
}
