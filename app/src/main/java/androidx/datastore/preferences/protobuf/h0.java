package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class h0 {

    static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0883g f9410a;

        a(AbstractC0883g abstractC0883g) {
            this.f9410a = abstractC0883g;
        }

        @Override // androidx.datastore.preferences.protobuf.h0.b
        public byte a(int i8) {
            return this.f9410a.c(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.h0.b
        public int size() {
            return this.f9410a.size();
        }
    }

    private interface b {
        byte a(int i8);

        int size();
    }

    static String a(AbstractC0883g abstractC0883g) {
        return b(new a(abstractC0883g));
    }

    static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i8 = 0; i8 < bVar.size(); i8++) {
            byte a8 = bVar.a(i8);
            if (a8 == 34) {
                sb.append("\\\"");
            } else if (a8 == 39) {
                sb.append("\\'");
            } else if (a8 != 92) {
                switch (a8) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a8 < 32 || a8 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a8 >>> 6) & 3) + 48));
                            sb.append((char) (((a8 >>> 3) & 7) + 48));
                            sb.append((char) ((a8 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a8);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(AbstractC0883g.o(str));
    }
}
